package sc5;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f406563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406564e;

    public c(com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f406563d = f9Var;
        this.f406564e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc5.f fVar = sc5.f.f406567a;
        sc5.f.c(fVar, "chat_message_event", sc5.f.a(fVar, this.f406563d, this.f406564e));
    }
}
