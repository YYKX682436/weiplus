package lf2;

/* loaded from: classes10.dex */
public final class l extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f318294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf2.s f318295e;

    public l(android.content.Context context, lf2.s sVar) {
        this.f318294d = context;
        this.f318295e = sVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f318295e.e0().size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        r45.y34 y34Var;
        lf2.c holder = (lf2.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        lf2.s sVar = this.f318295e;
        java.lang.Object obj = sVar.e0().get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        lf2.b bVar = (lf2.b) obj;
        android.view.View view = holder.f318277e;
        int i18 = bVar.f318275b ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$ReverberationItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$ReverberationItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        om2.m mVar = bVar.f318274a;
        java.lang.String str = mVar.f346357e;
        android.widget.TextView textView = holder.f318279g;
        textView.setText(str);
        com.tencent.mm.ui.fk.a(textView);
        holder.itemView.setOnClickListener(new lf2.i(sVar, i17, this));
        android.widget.ImageView imageView = holder.f318278f;
        imageView.setImageDrawable(null);
        android.content.Context context = this.f318294d;
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        if (mVar != om2.m.f346352o) {
            java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.finder.live.util.d2.f115478c;
            java.util.ArrayList arrayList2 = om2.n.f346359a;
            switch (mVar.ordinal()) {
                case 1:
                    y34Var = r45.y34.ReverbType_Studio;
                    break;
                case 2:
                    y34Var = r45.y34.ReverbType_Church;
                    break;
                case 3:
                    y34Var = r45.y34.ReverbType_Hall;
                    break;
                case 4:
                    y34Var = r45.y34.ReverbType_Room;
                    break;
                case 5:
                    y34Var = r45.y34.ReverbType_Origin;
                    break;
                case 6:
                    y34Var = r45.y34.ReverbType_Deepmusic;
                    break;
                case 7:
                    y34Var = r45.y34.ReverbType_Changjiang;
                    break;
                default:
                    y34Var = r45.y34.ReverbType_None;
                    break;
            }
            om2.b bVar2 = (om2.b) linkedHashMap.get(java.lang.Integer.valueOf(y34Var.ordinal()));
            if (bVar2 != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(bVar2.f346273c, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329965s));
                lf2.k kVar = new lf2.k(holder, context);
                b17.getClass();
                b17.f447876g = kVar;
                b17.c(imageView);
            }
        }
        int i19 = mVar.f346358f;
        if (i19 > 0) {
            imageView.setImageDrawable(context.getResources().getDrawable(i19));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f318294d).inflate(com.tencent.mm.R.layout.drj, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new lf2.c(inflate);
    }
}
