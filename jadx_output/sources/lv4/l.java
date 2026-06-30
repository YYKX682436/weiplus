package lv4;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lv4.m f321525d;

    public l(lv4.m mVar) {
        this.f321525d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lv4.m mVar = this.f321525d;
        ((rv4.h) mVar.f321527b).l(!r1.f400484m);
        rv4.h hVar = (rv4.h) mVar.f321527b;
        rv4.w wVar = hVar.f400472a;
        java.lang.String str2 = wVar.f331674a;
        java.lang.String str3 = hVar.f400485n;
        ov4.f fVar = ov4.f.f349231f;
        if (hVar.f400484m) {
            ov4.g[] gVarArr = ov4.g.f349235d;
            str = "8";
        } else {
            ov4.g[] gVarArr2 = ov4.g.f349235d;
            str = "7";
        }
        wVar.f331675b.c(new ov4.e(str2, null, str3, 0, 101, fVar, 0L, str, hVar.i().a(), "", 0, null, 0, 7242, null));
        kv4.m mVar2 = mVar.f321526a;
        ((qv4.r0) mVar2).j();
        jv4.i iVar = ((qv4.r0) mVar2).f367010d;
        if (iVar != null) {
            ((jv4.e) ((jv4.p) iVar).f302262e).f302235a.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
