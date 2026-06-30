package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {
    public r(com.tencent.mm.plugin.record.ui.viewWrappers.s sVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        et3.b bVar = (et3.b) view.getTag();
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), pt0.f0.Li(bVar.f256600k, bVar.f256592c).G, bVar.f256590a.M)) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i18 = bVar.f256594e;
        if (i18 == 0) {
            if (bt3.g2.K(bVar.f256590a, bVar.f256600k, bVar.f256592c)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightViewWrapper", "onclick: play sight");
                android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.record.ui.RecordMsgFileUI.class);
                intent.putExtra("message_id", bVar.f256592c);
                intent.putExtra("message_talker", bVar.f256600k);
                intent.putExtra("record_xml", bVar.f256593d);
                intent.putExtra("record_data_id", bVar.f256590a.T);
                android.content.Context context = view.getContext();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(bt3.g2.y(bVar.f256590a.T, bVar.f256600k, bVar.f256592c, true));
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = D0 == null ? "null" : java.lang.Integer.valueOf(D0.field_status);
                com.tencent.mars.xlog.Log.i("MicroMsg.SightViewWrapper", "onclick: cdnInfo status %s", objArr);
                if (D0 != null && 2 != (i17 = D0.field_status) && 3 != i17) {
                    if (4 == i17) {
                        db5.e1.T(view.getContext(), view.getResources().getString(com.tencent.mm.R.string.ccc));
                        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (i17 == 0 || 1 == i17) {
                        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
                bt3.g2.O(bVar.f256590a, bVar.f256600k, bVar.f256592c, true);
            }
        } else if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightViewWrapper", "click item favid %d, localid %d, itemstatus %d", java.lang.Integer.valueOf(bVar.f256591b.field_id), java.lang.Long.valueOf(bVar.f256591b.field_localId), java.lang.Integer.valueOf(bVar.f256591b.field_itemStatus));
            if (bVar.f256591b.I0()) {
                com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
                am.z9 z9Var = favoriteOperationEvent.f54243g;
                z9Var.f8528a = 14;
                z9Var.f8533f = bVar.f256590a;
                favoriteOperationEvent.e();
                am.aa aaVar = favoriteOperationEvent.f54244h;
                com.tencent.mars.xlog.Log.i("MicroMsg.SightViewWrapper", "favItemInfo is Done,file exist ret = %d", java.lang.Integer.valueOf(aaVar.f6134a));
                if (aaVar.f6134a == 1) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_detail_info_id", bVar.f256591b.field_localId);
                    intent2.putExtra("key_detail_data_id", bVar.f256590a.T);
                    intent2.putExtra("key_detail_can_delete", false);
                    o72.x1.M0(view.getContext(), ".ui.detail.FavoriteFileDetailUI", intent2, 1, null);
                    yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f256590a.f375434s)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SightViewWrapper", "favItemInfo getCdnDataUrl empty");
                    yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.SightViewWrapper", "? info is done, source file not exist, cdn data url is not null");
            } else {
                o72.r2 r2Var = bVar.f256591b;
                if ((r2Var.field_itemStatus == 8) || r2Var.P0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightViewWrapper", "favItemInfo isDownLoadFaied or isUploadFailed, wait download");
                } else {
                    if (bVar.f256591b.J0() || bVar.f256591b.Q0()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightViewWrapper", "favItemInfo isDownloading or isUploadding, wait download");
                        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.SightViewWrapper", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                }
            }
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            o72.r2 r2Var2 = bVar.f256591b;
            long j17 = r2Var2.field_localId;
            am.z9 z9Var2 = favoriteOperationEvent2.f54243g;
            z9Var2.f8532e = j17;
            if (r2Var2.P0()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SightViewWrapper", "upload failed, try to restart...");
                z9Var2.f8528a = 15;
                favoriteOperationEvent2.e();
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.SightViewWrapper", "download failed, try to restart...");
                z9Var2.f8528a = 16;
                favoriteOperationEvent2.e();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
