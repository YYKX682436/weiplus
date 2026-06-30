package yk5;

/* loaded from: classes11.dex */
public class p implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yk5.u f462895a;

    public p(yk5.u uVar) {
        this.f462895a = uVar;
    }

    @Override // bb5.e
    public int a() {
        java.util.LinkedList linkedList = this.f462895a.f462910t;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SearchResultAdapter", "pos is invalid");
            return null;
        }
        yk5.u uVar = this.f462895a;
        r45.gw5 u17 = uVar.u(i17 + uVar.l() + 1);
        if (u17 == null) {
            return null;
        }
        return u17.f375561d.f372756d;
    }
}
