package com.example;

import com.ibm.mm.viewer.CMBDocument;
import com.ibm.mm.viewer.CMBStreamingDocServicesCallbacks;

import java.io.InputStream;

public class ExampleCallback extends CMBStreamingDocServicesCallbacks {
    @Override
    public InputStream getForm(final CMBDocument cmbDocument, final String s) {
        return null;
    }

    @Override
    public InputStream getPart(final CMBDocument cmbDocument, final int i, final StringBuffer stringBuffer) {
        return null;
    }

    @Override
    public InputStream getAnnotation(final CMBDocument cmbDocument, final int i) {
        return null;
    }

    @Override
    public InputStream getResources(final CMBDocument cmbDocument) {
        return null;
    }

    @Override
    public boolean traceEnabled() {
        return false;
    }

    @Override
    public void trace(final String s) {

    }
}
