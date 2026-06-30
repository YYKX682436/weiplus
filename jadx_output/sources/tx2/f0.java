package tx2;

/* loaded from: classes3.dex */
public final class f0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f422555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422557c;

    public f0(r45.h32 h32Var, tx2.i0 i0Var, java.lang.String str) {
        this.f422555a = h32Var;
        this.f422556b = i0Var;
        this.f422557c = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String string = this.f422555a.getString(4);
            if (string == null) {
                string = "";
            }
            linkedHashMap.put("notice_id", string);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.B;
            android.content.Context context = this.f422556b.f118381d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.zb.I8(zbVar, u1Var, linkedHashMap, null, java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6().getInteger(5)), null, this.f422557c, false, 84, null);
        }
    }
}
