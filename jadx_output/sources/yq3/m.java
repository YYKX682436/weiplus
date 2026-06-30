package yq3;

/* loaded from: classes11.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f464513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yq3.v vVar) {
        super(1);
        this.f464513d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.storage.ya yaVar = this.f464513d.f464536g;
        if (yaVar != null) {
            yaVar.field_contactLabels = str;
        }
        return jz5.f0.f302826a;
    }
}
