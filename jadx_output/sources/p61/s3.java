package p61;

/* loaded from: classes8.dex */
public class s3 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f352371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r61.s0 f352372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI f352373c;

    public s3(com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI, java.util.ArrayList arrayList, r61.s0 s0Var) {
        this.f352373c = googleFriendUI;
        this.f352371a = arrayList;
        this.f352372b = s0Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            r61.s0 s0Var = (r61.s0) this.f352371a.get(i18);
            int i19 = com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.f73067u;
            this.f352373c.U6(s0Var, this.f352372b);
        }
    }
}
