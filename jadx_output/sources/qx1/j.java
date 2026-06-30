package qx1;

/* loaded from: classes10.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f367291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f367292e;

    public j(qx1.q qVar, mx1.a aVar) {
        this.f367292e = qVar;
        this.f367291d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider h17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.h(4);
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        h17.f155677o = uICustomParam;
        qx1.q qVar = this.f367292e;
        if (qVar.f367321o) {
            ut3.m.f431182a.d(qVar.f367308b.getContext(), 4100, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, h17, 0);
        } else {
            android.content.Intent intent = new android.content.Intent();
            qVar.getClass();
            com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) intent.getParcelableExtra("KEY_SIGHT_PARAMS");
            if (sightParams == null) {
                sightParams = new com.tencent.mm.plugin.mmsight.SightParams(4, 0);
            }
            java.lang.String str = "micromsg_" + java.lang.System.currentTimeMillis();
            java.lang.String str2 = lp0.b.m() + str + ".mp4";
            java.lang.String str3 = lp0.b.m() + str + ".jpeg";
            int intExtra = intent.getIntExtra("key_pick_local_media_duration", 60);
            com.tencent.mm.plugin.mmsight.SightParams sightParams2 = new com.tencent.mm.plugin.mmsight.SightParams(4, 1);
            sightParams2.f148818e = 2;
            sightParams2.f148817d = 0;
            if (sightParams2.f148819f == null) {
                sightParams2.f148819f = new com.tencent.mm.modelcontrol.VideoTransPara();
            }
            sightParams2.f148819f.f71195h = intExtra;
            sightParams2.a(str, str2, str3, q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
            intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = qVar.f367308b.getContext();
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.j(context, 4101, intent, 4, 1);
        }
        this.f367291d.q0(256L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
