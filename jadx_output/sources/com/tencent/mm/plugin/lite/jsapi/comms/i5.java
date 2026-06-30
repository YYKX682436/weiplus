package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f143610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f143612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f143613g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.j5 f143614h;

    public i5(com.tencent.mm.plugin.lite.jsapi.comms.j5 j5Var, android.content.Context context, java.lang.String str, android.content.Intent intent, boolean z17) {
        this.f143614h = j5Var;
        this.f143610d = context;
        this.f143611e = str;
        this.f143612f = intent;
        this.f143613g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f143610d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f143610d.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.lite.jsapi.comms.g5(this));
        c01.p8 a17 = c01.n8.a();
        ((c01.k7) a17).b(this.f143611e, 18, new com.tencent.mm.plugin.lite.jsapi.comms.h5(this, Q));
    }
}
