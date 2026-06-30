package l72;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f316836d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f316837e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f316838f;

    /* renamed from: g, reason: collision with root package name */
    public final l72.b0 f316839g;

    public c0(java.lang.String str, int i17, int i18, boolean z17, l72.b0 b0Var) {
        super(i17, i18);
        this.f316836d = true;
        this.f316837e = true;
        this.f316838f = "";
        this.f316837e = z17;
        this.f316838f = str;
        this.f316839g = b0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        l72.b0 b0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f316836d && (b0Var = this.f316839g) != null) {
            b0Var.a(this.f316838f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0
    public void setColor(int i17, int i18) {
        super.setColor(i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f316837e) {
            com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }
}
