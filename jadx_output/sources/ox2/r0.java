package ox2;

/* loaded from: classes8.dex */
public abstract class r0 {
    public static final void a(android.widget.ImageView imageView, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17, java.lang.String source) {
        kotlin.jvm.internal.o.g(imageView, "<this>");
        kotlin.jvm.internal.o.g(source, "source");
        if (iEmojiInfo != null) {
            try {
                i95.m c17 = i95.n0.c(com.tencent.mm.feature.emoji.api.u5.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                if (iEmojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo) {
                    zq.h.f474972a.d((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, imageView, null);
                }
                if (z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(imageView, "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } catch (java.lang.Exception e17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadCover ");
                sb6.append(source);
                sb6.append(" error: ");
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "";
                }
                sb6.append(message);
                com.tencent.mars.xlog.Log.e("safeLoadInteractionEasterEggEmoji", sb6.toString());
                if (z17) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(imageView, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(java.lang.Integer.valueOf(intValue2));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(imageView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(imageView, "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }
}
