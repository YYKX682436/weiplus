package km3;

/* loaded from: classes10.dex */
public final class m {
    public m(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.widget.TextView textView, android.view.View view, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, int i17, int i18) {
        km3.p pVar;
        if (textView == null || view == null || galleryItem$VideoMediaItem == null) {
            com.tencent.mars.xlog.Log.e("Music.MusicMvAlbumAdapter", "Error input for duration fetcher");
            return;
        }
        java.util.HashMap hashMap = km3.p.f309251m;
        if (hashMap.containsKey(textView) && (pVar = (km3.p) hashMap.get(textView)) != null) {
            if (kotlin.jvm.internal.o.b(pVar.f309254f, galleryItem$VideoMediaItem)) {
                return;
            }
            java.lang.ref.WeakReference weakReference = pVar.f309252d;
            kotlin.jvm.internal.o.d(weakReference);
            if (kotlin.jvm.internal.o.b(textView, weakReference.get())) {
                pVar.f309252d = new java.lang.ref.WeakReference(null);
                pVar.f309253e = new java.lang.ref.WeakReference(null);
                pVar.f309256h = true;
            }
        }
        int i19 = galleryItem$VideoMediaItem.f138446x;
        if (i19 >= 0) {
            com.tencent.mars.xlog.Log.i("Music.MusicMvAlbumAdapter", "Directly attach durationMs %d to tv, path %s", java.lang.Integer.valueOf(i19), galleryItem$VideoMediaItem);
            b(textView, view, galleryItem$VideoMediaItem.f138446x, i17, i18, galleryItem$VideoMediaItem.f138442t);
            hashMap.remove(textView);
        } else {
            textView.setText("");
            km3.p pVar2 = new km3.p(textView, view, galleryItem$VideoMediaItem, new km3.l(i17, i18), null);
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            t23.p0.n().b(pVar2);
            hashMap.put(textView, pVar2);
        }
    }

    public final void b(android.widget.TextView textView, android.view.View view, int i17, int i18, int i19, boolean z17) {
        if (textView == null) {
            return;
        }
        if (i17 < 0) {
            textView.setText("--:--");
            return;
        }
        int a17 = lm3.d0.a(i17);
        int c17 = lm3.d0.c(i18);
        int b17 = lm3.d0.b(i19);
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (a17 < c17 || a17 > b17 || z17) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.1f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(a17 % 60);
        if (valueOf.length() < 2) {
            valueOf = "0".concat(valueOf);
        }
        textView.setText((a17 / 60) + ':' + valueOf);
    }
}
