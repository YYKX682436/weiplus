package rf4;

/* loaded from: classes4.dex */
public final class a2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f395020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f395022f;

    public a2(boolean z17, com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView, int i17) {
        this.f395020d = z17;
        this.f395021e = storyMsgView;
        this.f395022f = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.List arrayList3;
        java.lang.String stringBuffer;
        kotlin.jvm.internal.o.g(animation, "animation");
        if (this.f395020d) {
            return;
        }
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395021e;
        android.view.View view = storyMsgView.f172014i;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateOpen$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateOpen$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = storyMsgView.f172020r;
        java.util.ArrayList arrayList5 = storyMsgView.f172018p;
        int i17 = this.f395022f;
        if (z17) {
            storyMsgView.f172011f.setCurrentItem(i17);
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList5.get(0);
            if4.a aVar = storyMsgView.f172019q;
            if (aVar == null || (arrayList2 = aVar.f291242j) == null) {
                arrayList2 = new java.util.ArrayList();
            }
            storyMsgListView.c(arrayList2);
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView2 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList5.get(1);
            if4.a aVar2 = storyMsgView.f172019q;
            if (aVar2 == null || (arrayList3 = aVar2.f291240h) == null) {
                arrayList3 = new java.util.ArrayList();
            }
            storyMsgListView2.c(arrayList3);
            if (i17 == 0) {
                mf4.d dVar = mf4.d.f326160a;
                long j17 = storyMsgView.f172025w;
                if (j17 == 0) {
                    stringBuffer = "";
                } else {
                    java.lang.String bigInteger = new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString();
                    kotlin.jvm.internal.o.f(bigInteger, "toString(...)");
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(bigInteger);
                    while (stringBuffer2.length() < 25) {
                        stringBuffer2.insert(0, "0");
                    }
                    stringBuffer = stringBuffer2.toString();
                    kotlin.jvm.internal.o.f(stringBuffer, "toString(...)");
                }
                if (mf4.d.f326167h) {
                    com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct storyPageExposeStruct = mf4.d.f326161b;
                    storyPageExposeStruct.f60916d = 8L;
                    storyPageExposeStruct.f60917e = storyPageExposeStruct.b("StoryId", stringBuffer, true);
                    dVar.b();
                }
                mf4.d.f326167h = false;
            } else {
                java.lang.String str = "";
                if (i17 == 1) {
                    mf4.d dVar2 = mf4.d.f326160a;
                    long j18 = storyMsgView.f172025w;
                    if (j18 != 0) {
                        java.lang.String bigInteger2 = new java.math.BigInteger(java.lang.Long.toBinaryString(j18), 2).toString();
                        kotlin.jvm.internal.o.f(bigInteger2, "toString(...)");
                        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer(bigInteger2);
                        while (stringBuffer3.length() < 25) {
                            stringBuffer3.insert(0, "0");
                        }
                        java.lang.String stringBuffer4 = stringBuffer3.toString();
                        kotlin.jvm.internal.o.f(stringBuffer4, "toString(...)");
                        str = stringBuffer4;
                    }
                    if (mf4.d.f326168i) {
                        com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct storyPageExposeStruct2 = mf4.d.f326161b;
                        storyPageExposeStruct2.f60916d = 5L;
                        storyPageExposeStruct2.f60917e = storyPageExposeStruct2.b("StoryId", str, true);
                        dVar2.b();
                    }
                    mf4.d.f326168i = false;
                }
            }
        } else {
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView3 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList5.get(i17);
            if4.a aVar3 = storyMsgView.f172019q;
            if (aVar3 == null || (arrayList = aVar3.f291240h) == null) {
                arrayList = new java.util.ArrayList();
            }
            storyMsgListView3.c(arrayList);
            com.tencent.mm.plugin.story.ui.view.StoryMsgInputView commentInputView = storyMsgView.getCommentInputView();
            java.lang.CharSequence charSequence = storyMsgView.f172027y;
            int i18 = com.tencent.mm.plugin.story.ui.view.StoryMsgInputView.f171984x;
            commentInputView.d(charSequence, "", false);
            com.tencent.mm.plugin.story.ui.view.StoryMsgInputView commentInputView2 = storyMsgView.getCommentInputView();
            if4.a aVar4 = storyMsgView.f172019q;
            java.util.LinkedList linkedList = aVar4 != null ? aVar4.f291240h : null;
            commentInputView2.e(0, linkedList == null || linkedList.isEmpty());
            storyMsgView.f172022t = storyMsgView.f172023u;
        }
        com.tencent.mm.plugin.story.ui.view.StoryActionView storyActionView = storyMsgView.f172016n;
        storyActionView.f171920w = true;
        storyActionView.f171921x = i17;
        if (storyActionView.f171915r) {
            android.widget.TextView textView = storyActionView.f171911n;
            textView.setBackground(null);
            android.widget.TextView textView2 = storyActionView.f171912o;
            textView2.setBackground(null);
            if (i17 == 0) {
                storyActionView.a(textView);
                storyActionView.c(textView2);
                storyActionView.d(false, textView);
            } else if (i17 == 1) {
                storyActionView.a(textView2);
                storyActionView.c(textView);
                storyActionView.d(false, textView2);
            }
        } else {
            android.view.View view2 = storyActionView.f171914q;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgOpened", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgOpened", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.q onMsgPanelStateCallback = storyMsgView.getOnMsgPanelStateCallback();
        if (onMsgPanelStateCallback != null) {
            onMsgPanelStateCallback.invoke(3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(storyMsgView.f172020r));
        }
    }
}
