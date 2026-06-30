package com.tencent.tav.decoder;

/* loaded from: classes10.dex */
public class RenderContextParams {
    private java.util.HashMap<java.lang.String, java.lang.Object> params = new java.util.HashMap<>();

    public java.lang.Object getParam(java.lang.String str) {
        return this.params.get(str);
    }

    public void putParam(java.lang.String str, java.lang.Object obj) {
        this.params.put(str, obj);
    }
}
