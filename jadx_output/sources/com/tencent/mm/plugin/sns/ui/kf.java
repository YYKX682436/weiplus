package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class kf extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f169627d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f169628e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.lf f169629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI f169630g;

    public kf(com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI snsChatRoomMemberUI, android.content.Context context, com.tencent.mm.storage.a3 a3Var, java.lang.String str, java.util.List list, java.lang.String str2) {
        this.f169630g = snsChatRoomMemberUI;
        this.f169627d = a3Var;
        this.f169628e = context;
    }

    public com.tencent.mm.plugin.sns.ui.Cif a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        int i18 = com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.f166838s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        java.util.List list = this.f169630g.f166847o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.tencent.mm.plugin.sns.ui.Cif cif = (com.tencent.mm.plugin.sns.ui.Cif) ((java.util.ArrayList) list).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        return cif;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.f166838s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        java.util.List list = this.f169630g.f166847o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        int size = ((java.util.ArrayList) list).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        com.tencent.mm.plugin.sns.ui.Cif a17 = a(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        return a17;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        return j17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.mf mfVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        android.content.Context context = this.f169628e;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.cqw, null);
            mfVar = new com.tencent.mm.plugin.sns.ui.mf(null);
            mfVar.f169915a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.mh7);
            mfVar.f169916b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mh9);
            mfVar.f169916b.setMaxWidth((((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() * 2) / 3);
            mfVar.f169917c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mh_);
            view.setTag(mfVar);
        } else {
            mfVar = (com.tencent.mm.plugin.sns.ui.mf) view.getTag();
        }
        if (this.f169629f != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.sns.ui.jf(this, i17));
        }
        android.widget.TextView textView = mfVar.f169917c;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i18 = com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.f166838s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI snsChatRoomMemberUI = this.f169630g;
        java.util.List list = snsChatRoomMemberUI.f166847o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.tencent.mm.plugin.sns.ui.Cif cif = (com.tencent.mm.plugin.sns.ui.Cif) ((java.util.ArrayList) list).get(i17);
        if (cif != null) {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView = mfVar.f169915a;
            com.tencent.mm.storage.z3 z3Var = cif.f168609a;
            ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, z3Var.d1(), null);
            java.lang.String T6 = com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.T6(snsChatRoomMemberUI, this.f169627d, z3Var.d1());
            java.lang.String w07 = !com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0()) ? z3Var.w0() : T6;
            if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
                w07 = z3Var.f2();
            }
            if (!T6.equals("") && !w07.equals(T6)) {
                w07 = T6 + "( " + w07 + " )";
            }
            mfVar.f169916b.setVisibility(0);
            android.widget.TextView textView2 = mfVar.f169916b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = mfVar.f169916b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, w07, textSize));
            if (mfVar.f169917c != null) {
                java.lang.String a17 = t41.g.a(z3Var);
                if (android.text.TextUtils.isEmpty(a17)) {
                    mfVar.f169917c.setVisibility(8);
                } else {
                    mfVar.f169917c.setVisibility(0);
                    mfVar.f169917c.setText(a17);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        return view;
    }
}
