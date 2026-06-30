package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class ld extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f199410d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f199411e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.dd f199412f;

    public ld(android.content.Context context, java.util.List list, com.tencent.mm.ui.chatting.component.dd ddVar) {
        this.f199410d = context;
        this.f199411e = list;
        this.f199412f = ddVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f199411e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list = this.f199411e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.tencent.mm.ui.chatting.component.fd fdVar = (com.tencent.mm.ui.chatting.component.fd) k3Var;
        rn.c cVar = (rn.c) list.get(i17);
        android.view.View view = fdVar.f199043d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean v07 = cVar.v0();
        android.content.Context context = this.f199410d;
        android.widget.ImageView imageView = fdVar.f199045f;
        android.widget.TextView textView = fdVar.f199046g;
        if (v07) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f481173bh1);
            textView.setText(context.getString(com.tencent.mm.R.string.ayn));
        } else {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(cVar.field_username);
            if (Bi == null) {
                ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(cVar.field_username, new com.tencent.mm.ui.chatting.component.hd(this, fdVar, cVar));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_title)) {
                    java.lang.String str = cVar.field_title;
                    if (str == null) {
                        str = "";
                    }
                    textView.setText(str);
                }
            } else {
                n11.a.b().h(Bi.field_smallHeadURL, imageView, com.tencent.mm.ui.chatting.component.fd.f199042n);
                java.lang.String str2 = cVar.field_title;
                java.lang.String str3 = Bi.field_nickname;
                if (str2 == null) {
                    str2 = str3;
                }
                textView.setText(str2);
            }
        }
        android.widget.RelativeLayout relativeLayout = fdVar.f199044e;
        if (i17 == 0) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams.leftMargin == 0) {
                layoutParams.leftMargin = i65.a.b(context, 2);
                relativeLayout.setLayoutParams(layoutParams);
            }
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams2.leftMargin != 0) {
                layoutParams2.leftMargin = 0;
                relativeLayout.setLayoutParams(layoutParams2);
            }
        }
        int i18 = cVar.field_state;
        android.widget.RelativeLayout relativeLayout2 = fdVar.f199048i;
        android.widget.RelativeLayout relativeLayout3 = fdVar.f199047h;
        if (i18 == 0) {
            relativeLayout3.setVisibility(8);
            if (cVar.field_nreply > 0) {
                relativeLayout2.setVisibility(0);
                fdVar.f199049m.setText("" + cVar.field_nreply);
            } else {
                relativeLayout2.setVisibility(8);
            }
        } else if (i18 == 1) {
            relativeLayout3.setVisibility(0);
            relativeLayout2.setVisibility(8);
            relativeLayout3.setTag(cVar);
            relativeLayout3.setOnClickListener(new com.tencent.mm.ui.chatting.component.id(this, fdVar));
        }
        relativeLayout.setTag(cVar);
        relativeLayout.setOnClickListener(new com.tencent.mm.ui.chatting.component.jd(this, fdVar));
        relativeLayout.setOnLongClickListener(new com.tencent.mm.ui.chatting.component.kd(this, fdVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.component.fd(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488438tb, viewGroup, false));
    }
}
