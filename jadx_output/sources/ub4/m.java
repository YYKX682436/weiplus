package ub4;

/* loaded from: classes4.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub4.n f426188d;

    public m(ub4.n nVar, ub4.p pVar) {
        this.f426188d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        android.content.Intent intent;
        int i17;
        java.lang.String str8;
        java.lang.String str9;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof ub4.o)) {
            ub4.n nVar = this.f426188d;
            ub4.p pVar = nVar.f426191f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            ub4.l lVar = pVar.f426195e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            if (lVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                ub4.l lVar2 = nVar.f426191f.f426195e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                int i18 = ((ub4.o) view.getTag()).f426192a;
                java.lang.String str10 = ((ub4.o) view.getTag()).f426193b;
                ub4.t tVar = (ub4.t) lVar2;
                tVar.getClass();
                java.lang.String str11 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGridItemClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumUI", "onClickItem localId=%s, mediaId=%s", java.lang.Integer.valueOf(i18), str10);
                int i19 = com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.f167760t;
                java.lang.String str12 = "access$100";
                java.lang.String str13 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = tVar.f426198a;
                snsAlbumUI.getClass();
                java.lang.String str14 = "goSnsGallery";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goSnsGallery", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                android.content.Intent intent2 = new android.content.Intent(snsAlbumUI.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsGalleryUI.class);
                intent2.putExtra("sns_gallery_userName", snsAlbumUI.f167768n);
                intent2.putExtra("sns_gallery_is_self", com.tencent.mm.sdk.platformtools.t8.D0(snsAlbumUI.f167767m, snsAlbumUI.f167768n));
                intent2.putExtra("sns_gallery_localId", i18);
                intent2.putExtra("sns_source", snsAlbumUI.f167769o);
                intent2.putExtra("sns_video_scene", 3);
                intent2.putExtra("key_from_scene", 5);
                intent2.putExtra("INTENT_ALBUM_SCENE", 3);
                ub4.i iVar = snsAlbumUI.f167764g;
                if (iVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    java.lang.String str15 = iVar.f426170g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    intent2.putExtra("sns_gallery_limit_seq", str15);
                    com.tencent.mm.plugin.sns.model.d6 d6Var = snsAlbumUI.f167771q;
                    java.lang.String str16 = snsAlbumUI.f167768n;
                    ub4.i iVar2 = snsAlbumUI.f167764g;
                    iVar2.getClass();
                    str2 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    str3 = "onGridItemClick";
                    str = "onClick";
                    int i27 = 0;
                    while (true) {
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) iVar2.f426167d;
                        str4 = str11;
                        if (i27 >= arrayList3.size()) {
                            break;
                        }
                        java.util.Iterator it = ((ub4.c) arrayList3.get(i27)).f426152a.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
                            java.util.Iterator it6 = it;
                            int i28 = snsInfo.localid;
                            if (snsInfo.getTimeLine() != null) {
                                str8 = str12;
                                if (snsInfo.getTimeLine().ContentObj == null || snsInfo.getTimeLine().ContentObj.f369840h.size() == 0) {
                                    i17 = i18;
                                } else {
                                    if (snsInfo.isPhoto()) {
                                        str9 = str13;
                                    } else {
                                        str9 = str13;
                                        if (snsInfo.getTimeLine().ContentObj.f369837e != 15) {
                                            it = it6;
                                            str12 = str8;
                                            str13 = str9;
                                        }
                                    }
                                    if (i28 == i18) {
                                        iVar2.f426175o = arrayList2.size();
                                    }
                                    java.util.Iterator it7 = snsInfo.getTimeLine().ContentObj.f369840h.iterator();
                                    int i29 = 0;
                                    while (it7.hasNext()) {
                                        int i37 = i18;
                                        r45.jj4 jj4Var = (r45.jj4) it7.next();
                                        java.util.Iterator it8 = it7;
                                        if (com.tencent.mm.sdk.platformtools.t8.D0(jj4Var.f377855d, str10)) {
                                            iVar2.f426175o += i29;
                                        }
                                        r45.m33 m33Var = new r45.m33();
                                        m33Var.f380109d = jj4Var;
                                        m33Var.f380110e = com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i28);
                                        m33Var.f380111f = snsInfo.getCreateTime();
                                        m33Var.f380112g = i29;
                                        arrayList2.add(m33Var);
                                        i29++;
                                        it7 = it8;
                                        i18 = i37;
                                        str14 = str14;
                                        intent2 = intent2;
                                    }
                                    i17 = i18;
                                    it = it6;
                                    str12 = str8;
                                    str13 = str9;
                                    i18 = i17;
                                    str14 = str14;
                                    intent2 = intent2;
                                }
                            } else {
                                i17 = i18;
                                str8 = str12;
                            }
                            str9 = str13;
                            it = it6;
                            str12 = str8;
                            str13 = str9;
                            i18 = i17;
                            str14 = str14;
                            intent2 = intent2;
                        }
                        i27++;
                        str11 = str4;
                    }
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    d6Var.s(str16, arrayList2);
                    ub4.i iVar3 = snsAlbumUI.f167764g;
                    iVar3.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    int i38 = iVar3.f426175o;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                    intent = intent2;
                    intent.putExtra("sns_gallery_position", i38);
                } else {
                    str3 = "onGridItemClick";
                    str4 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3";
                    str5 = "access$100";
                    str = "onClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
                    str6 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI";
                    str7 = "goSnsGallery";
                    intent = intent2;
                }
                snsAlbumUI.startActivityForResult(intent, 8);
                java.lang.String str17 = str6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
                java.lang.String str18 = str;
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", str18, "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str18, str2);
            }
        }
        str = "onClick";
        str2 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
        java.lang.String str182 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", str182, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str182, str2);
    }
}
