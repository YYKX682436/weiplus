package u84;

/* loaded from: classes4.dex */
public abstract class k extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: x, reason: collision with root package name */
    public static final kotlinx.coroutines.r0 f425561x;

    /* renamed from: o, reason: collision with root package name */
    public final int f425562o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f425563p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f425564q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f425565r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f425566s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f425567t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f425568u;

    /* renamed from: v, reason: collision with root package name */
    public u84.l f425569v;

    /* renamed from: w, reason: collision with root package name */
    public float f425570w;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        f425561x = new u84.j(kotlinx.coroutines.q0.f310567d);
    }

    public k(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, boolean z17) {
        super(str, yVar, view);
        this.f425562o = i17;
        this.f425563p = z17;
        this.f425564q = jz5.h.b(new u84.e(view));
        this.f425567t = jz5.h.b(new u84.d(this));
        this.f425568u = jz5.h.b(new u84.c(this));
    }

    public static final /* synthetic */ android.widget.TextView y(u84.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHighLightDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        android.widget.TextView z17 = kVar.z();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHighLightDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        return z17;
    }

    public final android.widget.TextView A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMHighLightTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f425567t).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMHighLightTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        return textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u84.k.d(java.lang.Object, boolean):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        android.widget.FrameLayout frameLayout = this.f425566s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
    }

    public final android.widget.TextView z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMHighLightDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f425568u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMHighLightDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        return textView;
    }
}
