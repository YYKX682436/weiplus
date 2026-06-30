package tb4;

/* loaded from: classes11.dex */
public class c implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb4.d f417023a;

    public c(tb4.d dVar) {
        this.f417023a = dVar;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateView", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ctd, viewGroup, false);
        tb4.d dVar = this.f417023a;
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n6w);
        tb4.a aVar = dVar.I;
        aVar.f417016a = imageView;
        aVar.f417017b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487017n71);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n6x);
        aVar.f417018c = textView;
        textView.setVisibility(8);
        aVar.f417019d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487016n70);
        aVar.f417020e = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.n6z);
        aVar.f417021f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n6y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        boolean z17 = dVar.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        if (z17) {
            aVar.f417021f.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.sns_label_more_btn, context.getResources().getColor(com.tencent.mm.R.color.BW_50)));
            aVar.f417021f.setOnClickListener(new tb4.b(this));
            aVar.f417021f.setVisibility(0);
        } else {
            aVar.f417021f.setVisibility(8);
        }
        inflate.setTag(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateView", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillingViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        tb4.a aVar = (tb4.a) bVar;
        tb4.d dVar2 = (tb4.d) dVar;
        java.lang.String str = dVar2.f206819z;
        if (str == null || str.length() <= 0) {
            aVar.f417016a.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(aVar.f417016a, dVar2.f206819z, 0.1f);
        }
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence = dVar2.f206818y;
        android.widget.TextView textView = aVar.f417017b;
        ((s50.r0) yVar).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, textView);
        if (c01.e2.R(dVar2.f206819z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            aVar.f417017b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            aVar.f417017b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence2 = dVar2.D;
        android.widget.TextView textView2 = aVar.f417018c;
        ((s50.r0) yVar2).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence2, textView2);
        u50.y yVar3 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence3 = dVar2.C;
        android.widget.TextView textView3 = aVar.f417019d;
        ((s50.r0) yVar3).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence3, textView3);
        tb4.d dVar3 = this.f417023a;
        if (dVar3.f206836e) {
            if (z17) {
                aVar.f417020e.setChecked(true);
                aVar.f417020e.setEnabled(false);
                aVar.f417020e.setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
            } else {
                aVar.f417020e.setChecked(z18);
                aVar.f417020e.setEnabled(true);
            }
            aVar.f417020e.setVisibility(0);
        } else {
            aVar.f417020e.setVisibility(8);
        }
        aVar.f417021f.setTag(dVar3.B);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillingViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
    }
}
