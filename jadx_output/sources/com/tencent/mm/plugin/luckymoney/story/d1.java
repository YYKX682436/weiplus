package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public final class d1 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager f145845d;

    public d1(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager) {
        this.f145845d = envelopeStoryViewPager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager = this.f145845d;
        if (envelopeStoryViewPager.getNeedLoopPlay()) {
            envelopeStoryViewPager.setFirstLoopPlay(false);
            if (it.what == 1) {
                int currentPosition = envelopeStoryViewPager.getCurrentPosition() + 1;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = envelopeStoryViewPager.f145813l2;
                if (wxRecyclerAdapter == null) {
                    kotlin.jvm.internal.o.o("storyDataAdapter");
                    throw null;
                }
                wxRecyclerAdapter.getItemCount();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = envelopeStoryViewPager.f145813l2;
                if (wxRecyclerAdapter2 == null) {
                    kotlin.jvm.internal.o.o("storyDataAdapter");
                    throw null;
                }
                if (currentPosition < wxRecyclerAdapter2.getItemCount()) {
                    com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager2 = this.f145845d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(currentPosition));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(envelopeStoryViewPager2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                    envelopeStoryViewPager2.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(envelopeStoryViewPager2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                } else {
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = envelopeStoryViewPager.f145813l2;
                    if (wxRecyclerAdapter3 == null) {
                        kotlin.jvm.internal.o.o("storyDataAdapter");
                        throw null;
                    }
                    if (currentPosition == wxRecyclerAdapter3.getItemCount()) {
                        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager3 = this.f145845d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(envelopeStoryViewPager3, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "scrollToPosition", "(I)V");
                        envelopeStoryViewPager3.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(envelopeStoryViewPager3, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
        return true;
    }
}
