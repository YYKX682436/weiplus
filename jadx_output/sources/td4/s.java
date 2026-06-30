package td4;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td4.g0 f417724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ td4.f2 f417725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ td4.x f417726f;

    public s(td4.g0 g0Var, td4.f2 f2Var, td4.x xVar) {
        this.f417724d = g0Var;
        this.f417725e = f2Var;
        this.f417726f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.ArrayList arrayList;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        td4.g0 g0Var = this.f417724d;
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.i iVar = g0Var.f417676r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (iVar != null) {
            android.view.View itemView = this.f417726f.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            java.lang.String str12 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$4";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGridMediaItemClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$4");
            td4.f2 itemData = this.f417725e;
            kotlin.jvm.internal.o.g(itemData, "itemData");
            int i17 = itemData.a().localid;
            java.lang.String Id = itemData.b().f377855d;
            kotlin.jvm.internal.o.f(Id, "Id");
            int i18 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
            java.lang.String str13 = "access$enterPreviewSnsAlbumItem";
            java.lang.String str14 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$enterPreviewSnsAlbumItem", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = ((td4.k1) iVar).f417696a;
            snsAlbumPickerUI.getClass();
            java.lang.String str15 = "enterPreviewSnsAlbumItem";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterPreviewSnsAlbumItem", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mm.plugin.sns.model.d6 d6Var = snsAlbumPickerUI.f170230i;
            if (d6Var != null) {
                str2 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1";
                java.lang.String str16 = snsAlbumPickerUI.f170232n;
                td4.g0 f76 = snsAlbumPickerUI.f7();
                f76.getClass();
                str = "onClick";
                java.lang.String str17 = "makeGalleryItems";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                str3 = "onGridMediaItemClick";
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (td4.f2 f2Var : f76.N()) {
                    java.lang.String str18 = str12;
                    java.lang.String str19 = str13;
                    if (f76.P().e(f2Var) || f76.P().d(f2Var)) {
                        str8 = str17;
                        str9 = str16;
                        str10 = str14;
                        str11 = str15;
                    } else {
                        int i19 = f2Var.a().localid;
                        str10 = str14;
                        r45.m33 m33Var = new r45.m33();
                        str11 = str15;
                        m33Var.f380109d = f2Var.b();
                        str8 = str17;
                        str9 = str16;
                        m33Var.f380110e = com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i19);
                        m33Var.f380111f = f2Var.a().getCreateTime();
                        m33Var.f380112g = f2Var.a().getTimeLine().ContentObj.f369840h.indexOf(f2Var.b());
                        arrayList3.add(m33Var);
                        if (kotlin.jvm.internal.o.b(m33Var.f380109d.f377855d, Id)) {
                            int size = arrayList3.size() - 1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                            td4.h0 y17 = f76.y();
                            y17.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                            y17.f417689d = size;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMObjIdMediaInfoMap", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                        java.util.Map map = (java.util.Map) ((jz5.n) f76.f417672n).getValue();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMObjIdMediaInfoMap", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                        java.lang.String Id2 = f2Var.b().f377855d;
                        kotlin.jvm.internal.o.f(Id2, "Id");
                        map.put(Id2, f2Var);
                    }
                    str13 = str19;
                    str12 = str18;
                    str14 = str10;
                    str15 = str11;
                    str16 = str9;
                    str17 = str8;
                }
                str4 = str12;
                str5 = str13;
                str6 = str14;
                str7 = str15;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str17, "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                d6Var.s(str16, arrayList4);
            } else {
                str3 = "onGridMediaItemClick";
                str4 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$4";
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1";
                str5 = "access$enterPreviewSnsAlbumItem";
                str6 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI";
                str7 = "enterPreviewSnsAlbumItem";
            }
            android.content.Intent intent = new android.content.Intent(snsAlbumPickerUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI.class);
            intent.putExtra("sns_gallery_userName", snsAlbumPickerUI.f170232n);
            intent.putExtra("sns_gallery_is_self", true);
            intent.putExtra("sns_gallery_localId", i17);
            intent.putExtra("sns_source", 0);
            intent.putExtra("sns_video_scene", 3);
            intent.putExtra("key_from_scene", 5);
            intent.putExtra("sns_gallery_limit_seq", snsAlbumPickerUI.f7().x());
            intent.putExtra("sns_album_select_limit_count", snsAlbumPickerUI.f170227f);
            td4.g0 f77 = snsAlbumPickerUI.f7();
            f77.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
            td4.h0 y18 = f77.y();
            y18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
            int i27 = y18.f417689d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
            intent.putExtra("sns_gallery_position", i27);
            td4.g0 f78 = snsAlbumPickerUI.f7();
            f78.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (f78.Q().isEmpty()) {
                arrayList = new java.util.ArrayList();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it = f78.Q().iterator();
                while (it.hasNext()) {
                    arrayList5.add(((td4.f2) it.next()).b().f377855d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                arrayList = arrayList5;
            }
            intent.putExtra("sns_album_select_mediaobj_id_list", arrayList);
            intent.putExtra("album_show_source_type", snsAlbumPickerUI.f170234p);
            snsAlbumPickerUI.startActivityForResult(intent, 8);
            java.lang.String str20 = str6;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str20);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str20);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
        } else {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1";
        }
        java.lang.String str21 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1", "android/view/View$OnClickListener", str21, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str21, str2);
    }
}
