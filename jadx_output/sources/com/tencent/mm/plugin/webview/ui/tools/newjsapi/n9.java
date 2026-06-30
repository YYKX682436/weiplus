package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class n9 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh0.n1 f186381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f186382c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186383d;

    public n9(java.lang.String str, vh0.n1 n1Var, android.content.Context context, java.lang.String str2) {
        this.f186380a = str;
        this.f186381b = n1Var;
        this.f186382c = context;
        this.f186383d = str2;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("override_session_id", this.f186380a);
            ((vh0.f3) this.f186381b).aj(this.f186382c, 15, this.f186383d, false, null, bundle);
        }
    }
}
