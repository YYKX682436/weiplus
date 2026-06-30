package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class s3 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment f151947e;

    public s3(com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment) {
        this.f151947e = musicMvTabFragment;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c4s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        com.tencent.mm.plugin.mv.ui.view.q3 item = (com.tencent.mm.plugin.mv.ui.view.q3) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.mv.ui.view.t3 t3Var = item.f151927d;
        long j17 = t3Var.f151951a;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = t3Var.f151952b;
        java.util.Objects.toString(finderObject);
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment = this.f151947e;
        if (list != null && list.contains(1)) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.p0n);
            if (finderObject == null || (objectDesc2 = finderObject.getObjectDesc()) == null || (media2 = objectDesc2.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media2)) == null) {
                return;
            }
            if (finderMedia2.getVideoDuration() < lm3.d0.c(musicMvTabFragment.f151723s) || finderMedia2.getVideoDuration() > lm3.d0.b(musicMvTabFragment.f151722r)) {
                if (p17.getAlpha() == 1.0f) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.1f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
                return;
            }
            if (p17.getAlpha() == 0.1f) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            return;
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.p0n);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p18.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
            o11.f fVar = new o11.f();
            fVar.f342082f = ll3.i1.f319182a.b("thumb_" + t3Var.f151951a);
            fVar.f342078b = true;
            fVar.f342077a = true;
            n11.a.b().h(finderMedia.getThumbUrl() + finderMedia.getThumb_url_token(), (android.widget.ImageView) holder.p(com.tencent.mm.R.id.p0n), fVar.a());
            android.view.View p19 = holder.p(com.tencent.mm.R.id.p0n);
            if (finderMedia.getVideoDuration() < lm3.d0.c(musicMvTabFragment.f151723s) || finderMedia.getVideoDuration() > lm3.d0.b(musicMvTabFragment.f151722r)) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Float.valueOf(0.1f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p19.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                if (p19.getAlpha() == 0.1f) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p19, arrayList5.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p19.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                    yj0.a.f(p19, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oyt);
            if (textView != null) {
                int videoDuration = finderMedia.getVideoDuration();
                if (videoDuration > 0) {
                    long j18 = videoDuration;
                    if (j18 < 86400) {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(j18 < 3600 ? "mm:ss" : "HH:mm:ss");
                        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+0:00"));
                        str = simpleDateFormat.format(java.lang.Long.valueOf(j18 * 1000));
                        textView.setText(str);
                    }
                }
                str = null;
                textView.setText(str);
            }
        }
        android.content.Context context = musicMvTabFragment.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.mv.ui.uic.c3 c3Var = (com.tencent.mm.plugin.mv.ui.uic.c3) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.tencent.mm.R.id.g8b);
        if (checkBox != null) {
            checkBox.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.r3(item, i17, musicMvTabFragment, checkBox));
        }
        if (!c3Var.P6()) {
            checkBox.setVisibility(8);
            return;
        }
        checkBox.setChecked(t3Var.f151953c);
        android.view.View p27 = holder.p(com.tencent.mm.R.id.p0n);
        if (checkBox.isChecked()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Float.valueOf(0.1f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p27, arrayList6.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p27, arrayList7.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        checkBox.setVisibility(0);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment = this.f151947e;
        int screenWidth = (musicMvTabFragment.getScreenWidth() - i65.a.b(musicMvTabFragment.getContext(), 4)) / 3;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.tencent.mm.R.id.m7j);
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = screenWidth;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.height = screenWidth;
    }
}
