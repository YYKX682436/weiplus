package w21;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg0.e f442427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f442428e;

    public m(w21.k kVar, dg0.e eVar, com.tencent.mm.storage.f9 f9Var) {
        this.f442427d = eVar;
        this.f442428e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.ui.chatting.v0) this.f442427d).p(this.f442428e);
    }
}
