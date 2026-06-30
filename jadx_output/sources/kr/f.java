package kr;

/* loaded from: classes15.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.panel.SmileyPanelView f311294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.emoji.panel.SmileyPanelView smileyPanelView) {
        super(0);
        this.f311294d = smileyPanelView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.emoji.panel.SmileyPanelView smileyPanelView = this.f311294d;
        ir.h config = smileyPanelView.getConfig();
        if (config != null) {
            boolean z17 = config.f293858q;
            android.widget.Button button = smileyPanelView.f64922y;
            if (z17) {
                button.setVisibility(0);
                button.setEnabled(config.f293859r);
            } else {
                button.setVisibility(8);
            }
            smileyPanelView.f64921x.setEnabled(config.f293859r);
            boolean z18 = config.f293859r;
            android.widget.ImageView imageView = smileyPanelView.f64920w;
            if (z18) {
                rr.v.a(imageView, com.tencent.mm.R.raw.icons_outlined_emoji_del, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            } else {
                rr.v.a(imageView, com.tencent.mm.R.raw.icons_outlined_emoji_del, -3355444);
            }
            if (!config.f293859r) {
                kr.i iVar = smileyPanelView.B;
                com.tencent.mm.sdk.platformtools.b4 b4Var = iVar.f311298d;
                if (b4Var != null) {
                    b4Var.d();
                }
                iVar.f311298d = null;
            }
            if (config.f293857p.length() > 0) {
                button.setText(config.f293857p);
            }
        }
        return jz5.f0.f302826a;
    }
}
