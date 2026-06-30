package tk3;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f419935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f419936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn5.a f419937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tk3.t tVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        super(0);
        this.f419935d = tVar;
        this.f419936e = multiTaskInfo;
        this.f419937f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f419935d.n(this.f419936e, this.f419937f);
        return jz5.f0.f302826a;
    }
}
