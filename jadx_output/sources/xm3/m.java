package xm3;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f455353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.List list, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        super(0);
        this.f455353d = list;
        this.f455354e = mvvmList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f455353d.iterator();
        while (it.hasNext()) {
            this.f455354e.x((xm3.o0) it.next());
        }
        return jz5.f0.f302826a;
    }
}
