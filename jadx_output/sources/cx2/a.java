package cx2;

/* loaded from: classes4.dex */
public class a implements com.tencent.mm.ui.widget.dialog.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f224527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f224528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f224530d;

    public a(android.view.View view, java.util.ArrayList arrayList, java.lang.String str, java.util.List list) {
        this.f224527a = view;
        this.f224528b = arrayList;
        this.f224529c = str;
        this.f224530d = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.f0
    public void a(boolean z17) {
        com.tencent.mm.sdk.platformtools.t8.t0(this.f224527a);
        java.util.ArrayList arrayList = this.f224528b;
        if (arrayList.size() == 0 && z17 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f224529c)) {
            java.util.List<java.lang.String> list = this.f224530d;
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
