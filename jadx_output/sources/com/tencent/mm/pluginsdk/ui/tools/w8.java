package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class w8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.z8 f191971d;

    public w8(com.tencent.mm.pluginsdk.ui.tools.z8 z8Var) {
        this.f191971d = z8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f191971d.evaluateJavascript("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe);}", null);
    }
}
