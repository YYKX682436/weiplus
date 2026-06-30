package sc5;

/* loaded from: classes9.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f406562d;

    public b(com.tencent.mm.storage.f9 f9Var) {
        this.f406562d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc5.f fVar = sc5.f.f406567a;
        java.util.Map a17 = sc5.f.a(fVar, this.f406562d, 3);
        a17.put("exp_params", "");
        sc5.f.c(fVar, "chat_message_click", a17);
    }
}
