package yk3;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk3.i f462822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f462823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462824f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yk3.i iVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, int i17) {
        super(0);
        this.f462822d = iVar;
        this.f462823e = multiTaskInfo;
        this.f462824f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yk3.i iVar = this.f462822d;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f462823e;
        pk3.h c17 = iVar.c(multiTaskInfo);
        if (c17 != null) {
            c17.U6(multiTaskInfo, this.f462824f);
        }
        return jz5.f0.f302826a;
    }
}
