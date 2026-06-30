package ov3;

/* loaded from: classes5.dex */
public final class b extends rv3.e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(yz5.p r2, iv3.b r3, boolean r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r2 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "clickCallback"
            kotlin.jvm.internal.o.g(r3, r6)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov3.b.<init>(yz5.p, iv3.b, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // rv3.e, in5.r
    public int e() {
        return com.tencent.mm.R.layout.ekz;
    }

    @Override // rv3.e, in5.r
    /* renamed from: o */
    public void h(in5.s0 holder, rv3.h item, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = item.f400395d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = audioCacheInfo.f155728y;
        if (finderObject == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
            return;
        }
        boolean z18 = true;
        if (!(list == null || list.isEmpty())) {
            for (java.lang.Object obj : list) {
                if (obj instanceof jz5.l) {
                    jz5.l lVar = (jz5.l) obj;
                    java.lang.Object obj2 = lVar.f302833d;
                    if (obj2 == rv3.f.f400389d) {
                        x(holder, item);
                    } else if (obj2 == rv3.f.f400390e) {
                        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uin);
                        java.lang.Object obj3 = lVar.f302834e;
                        java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
                        w(textView, bool != null ? bool.booleanValue() : false);
                    }
                }
            }
            return;
        }
        java.lang.String coverUrl = finderMedia.getCoverUrl();
        if (coverUrl != null && coverUrl.length() != 0) {
            z18 = false;
        }
        java.lang.String str = z18 ? finderMedia.getThumbUrl() + finderMedia.getThumb_url_token() : finderMedia.getCoverUrl() + finderMedia.getCover_url_token();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.uio);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        zy2.v8.a(ya2.l.f460502a, str, imageView, null, null, 12, null);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.uij)).setText(audioCacheInfo.f155723t);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.uii)).setText(finderObject.getRecommendReason());
        x(holder, item);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.uis);
        if (p17 != null) {
            p17.setOnClickListener(new ov3.a(this, holder, item));
        }
        yz5.p pVar = this.f400384e;
        if (pVar != null) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            pVar.invoke(itemView, item);
        }
    }

    public final void x(in5.s0 s0Var, rv3.h hVar) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.uis);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.uiu);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.uir);
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.uit);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.b(textView);
        int ordinal = hVar.f400399h.ordinal();
        android.content.Context context = s0Var.f293121e;
        if (ordinal == 1) {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.oaj));
            textView.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.abx));
            if (p17 != null) {
                p17.setBackground(null);
            }
            if (p18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal != 2) {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.oah));
            textView.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.f479549ab0));
            if (p17 != null) {
                p17.setBackgroundResource(com.tencent.mm.R.drawable.f481060jo);
            }
            if (p18 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        textView.setText(context.getResources().getString(com.tencent.mm.R.string.oah));
        textView.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.f479549ab0));
        if (p17 != null) {
            p17.setBackgroundResource(com.tencent.mm.R.drawable.f481060jo);
        }
        if (p18 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p19 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p19, arrayList6.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
