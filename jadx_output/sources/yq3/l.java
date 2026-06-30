package yq3;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f464512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yq3.v vVar) {
        super(0);
        this.f464512d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.ya yaVar = this.f464512d.f464536g;
        if (yaVar != null) {
            return yaVar.field_contactLabels;
        }
        return null;
    }
}
