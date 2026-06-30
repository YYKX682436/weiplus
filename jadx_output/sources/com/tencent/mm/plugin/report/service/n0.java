package com.tencent.mm.plugin.report.service;

/* loaded from: classes5.dex */
public class n0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f158290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158291e;

    public n0(com.tencent.mm.plugin.report.service.g0 g0Var, java.util.Map map, java.lang.String str) {
        this.f158290d = map;
        this.f158291e = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.Map map = this.f158290d;
        return new org.json.JSONArray().put((map == null ? new org.json.JSONObject() : new org.json.JSONObject(map)).put("info", this.f158291e));
    }
}
