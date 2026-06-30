package si4;

/* loaded from: classes11.dex */
public final class e implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi4.b f408320d;

    public e(qi4.b bVar) {
        this.f408320d = bVar;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("cclover_test", "event = " + str + ", eventData = " + w0Var, null);
        qi4.b bVar = this.f408320d;
        kotlin.jvm.internal.o.d(str);
        qi4.b.B1(bVar, str, w0Var.f316974b, null, 4, null);
    }
}
