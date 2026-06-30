package o00;

/* loaded from: classes11.dex */
public class c implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o00.d f341857a;

    public c(o00.d dVar) {
        this.f341857a = dVar;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e4e, viewGroup, false);
        o00.d dVar = this.f341857a;
        o00.b bVar = dVar.B;
        bVar.f341855a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzf);
        bVar.f341856b = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.gyt);
        inflate.setTag(bVar);
        if (dVar.f206834c) {
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gzg);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.tencent.mm.R.color.f478512u);
            }
            android.widget.TextView textView = bVar.f341855a;
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        o00.b bVar2 = (o00.b) bVar;
        java.lang.String str = ((o00.d) dVar).f341858y;
        android.widget.TextView textView = bVar2.f341855a;
        if (textView != null) {
            if (str == null || str.length() == 0) {
                textView.setVisibility(8);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = textView.getContext();
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize));
                textView.setVisibility(0);
            }
        }
        if (this.f341857a.f341859z) {
            bVar2.f341856b.setVisibility(0);
        } else {
            bVar2.f341856b.setVisibility(8);
        }
    }
}
