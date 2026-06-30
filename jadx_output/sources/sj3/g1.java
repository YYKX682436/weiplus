package sj3;

/* loaded from: classes11.dex */
public class g1 extends com.tencent.mm.ui.contact.item.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj3.h1 f408518b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(sj3.h1 h1Var) {
        super(h1Var);
        this.f408518b = h1Var;
    }

    @Override // com.tencent.mm.ui.contact.item.t, com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c3b, viewGroup, false);
        com.tencent.mm.ui.contact.item.s sVar = this.f408518b.f206935J;
        sVar.f206924b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        sVar.f206925c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        sVar.f206926d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        sVar.f206923a = inflate.findViewById(com.tencent.mm.R.id.mjc);
        sVar.f206927e = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        inflate.setTag(sVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.t, com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.s sVar = (com.tencent.mm.ui.contact.item.s) bVar;
        com.tencent.mm.ui.contact.item.u uVar = (com.tencent.mm.ui.contact.item.u) dVar;
        java.lang.String str = uVar.f206819z;
        if (str == null || str.length() <= 0) {
            sVar.f206924b.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(sVar.f206924b, uVar.f206819z, null);
        }
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence = uVar.f206818y;
        android.widget.TextView textView = sVar.f206925c;
        ((s50.r0) yVar).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, textView);
        if (!this.f408518b.f206836e) {
            sVar.f206927e.setVisibility(8);
            return;
        }
        if (z17) {
            sVar.f206927e.setChecked(true);
            sVar.f206927e.setEnabled(false);
            sVar.f206927e.setBackgroundResource(com.tencent.mm.R.raw.checkbox_selected_grey_dark);
        } else {
            sVar.f206927e.setChecked(z18);
            sVar.f206927e.setEnabled(true);
            if (z18) {
                sVar.f206927e.setBackgroundResource(com.tencent.mm.R.raw.checkbox_selected);
            } else {
                sVar.f206927e.setBackgroundResource(com.tencent.mm.R.drawable.f481260os);
            }
        }
        sVar.f206927e.setVisibility(0);
    }
}
