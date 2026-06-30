package r35;

/* loaded from: classes4.dex */
public class u0 implements com.tencent.mm.ui.widget.dialog.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f369265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f369266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f369268d;

    public u0(android.view.View view, java.util.ArrayList arrayList, java.lang.String str, java.util.List list) {
        this.f369265a = view;
        this.f369266b = arrayList;
        this.f369267c = str;
        this.f369268d = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.f0
    public void a(boolean z17) {
        com.tencent.mm.sdk.platformtools.t8.t0(this.f369265a);
        java.util.ArrayList arrayList = this.f369266b;
        if (arrayList.size() == 0 && z17 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f369267c)) {
            java.util.List<java.lang.String> list = this.f369268d;
            if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                return;
            }
            for (java.lang.String str : list) {
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                arrayList.add(c01.a2.e(str));
            }
        }
    }
}
