package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class dj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ej f203802f;

    public dj(com.tencent.mm.ui.chatting.viewitems.ej ejVar, java.lang.String str, java.lang.String str2) {
        this.f203802f = ejVar;
        this.f203800d = str;
        this.f203801e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        n11.a b17 = n11.a.b();
        com.tencent.mm.ui.chatting.viewitems.ej ejVar = this.f203802f;
        b17.h(this.f203800d, ejVar.f203888a.Q, ejVar.f203890c.F);
        java.lang.String str = this.f203801e;
        if (android.text.TextUtils.isEmpty(str)) {
            str = ejVar.f203889b;
        }
        ejVar.f203888a.R.setText(str);
    }
}
