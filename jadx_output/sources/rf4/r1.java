package rf4;

/* loaded from: classes4.dex */
public final class r1 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395103d;

    public r1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        this.f395103d = storyMsgView;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395103d;
        yz5.l onPageStateCallback = storyMsgView.getOnPageStateCallback();
        if (onPageStateCallback != null) {
            onPageStateCallback.invoke(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.story.ui.view.StoryActionView storyActionView = storyMsgView.f172016n;
        if (storyActionView.f171915r) {
            storyActionView.f171916s = i17;
            if (i17 == 2) {
                storyActionView.f171917t = true;
            } else if (i17 == 0) {
                storyActionView.f171919v = -1;
                storyActionView.f171917t = false;
                storyActionView.f171918u = -1.0f;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395103d;
        yz5.q onPageScrollCallback = storyMsgView.getOnPageScrollCallback();
        if (onPageScrollCallback != null) {
            onPageScrollCallback.invoke(java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18));
        }
        com.tencent.mm.plugin.story.ui.view.StoryActionView storyActionView = storyMsgView.f172016n;
        if (storyActionView.f171915r) {
            int i19 = storyActionView.f171916s;
            android.widget.TextView textView = storyActionView.f171912o;
            android.widget.TextView textView2 = storyActionView.f171911n;
            if (i19 == 1 && i17 == 0) {
                int i27 = storyActionView.f171906f >>> 24;
                int i28 = storyActionView.f171907g >>> 24;
                float max = java.lang.Math.max(java.lang.Math.min(f17, 1.0f), 0.0f);
                float f18 = (i27 - i28) * max;
                int max2 = (java.lang.Math.max(java.lang.Math.min((int) (i27 - f18), i27), i28) << 24) | 16777215;
                int max3 = (java.lang.Math.max(java.lang.Math.min((int) (i28 + f18), i27), i28) << 24) | 16777215;
                float f19 = storyActionView.f171904d;
                float f27 = storyActionView.f171905e;
                float f28 = (f19 - f27) * max;
                float max4 = java.lang.Math.max(java.lang.Math.min(f19 - f28, f19), f27);
                float max5 = java.lang.Math.max(java.lang.Math.min(f28 + f27, f19), f27);
                textView2.setTextColor(max2);
                textView2.setTextSize(0, max4);
                textView.setTextColor(max3);
                textView.setTextSize(0, max5);
            }
            float f29 = storyActionView.f171918u;
            int i29 = storyActionView.f171908h;
            if (f29 > f17) {
                storyActionView.f171919v = i29;
            } else if (f29 < f17) {
                storyActionView.f171919v = 0;
            }
            if (storyActionView.f171917t) {
                if (!(f29 == -1.0f)) {
                    if (!(f29 == 0.0f)) {
                        storyActionView.f171917t = false;
                        int i37 = storyActionView.f171919v;
                        if (i37 == 0) {
                            storyActionView.a(textView);
                            storyActionView.c(textView2);
                        } else if (i37 == i29) {
                            storyActionView.a(textView2);
                            storyActionView.c(textView);
                        }
                    }
                }
            }
            storyActionView.f171918u = f17;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.List arrayList3;
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395103d;
        storyMsgView.setCurPosition(i17);
        yz5.p onPageSelectedCallback = storyMsgView.getOnPageSelectedCallback();
        if (onPageSelectedCallback != null) {
            onPageSelectedCallback.invoke(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(storyMsgView.f172020r));
        }
        com.tencent.mm.plugin.story.ui.view.StoryActionView storyActionView = storyMsgView.f172016n;
        if (storyActionView != null) {
            storyActionView.f171921x = i17;
            if (storyActionView.f171915r) {
                if (i17 == 0) {
                    storyActionView.d(false, storyActionView.f171911n);
                } else if (i17 == 1) {
                    storyActionView.d(false, storyActionView.f171912o);
                }
            }
        }
        boolean z17 = storyMsgView.f172020r;
        java.util.ArrayList arrayList4 = storyMsgView.f172018p;
        if (!z17) {
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList4.get(i17);
            if4.a aVar = storyMsgView.f172019q;
            if (aVar == null || (arrayList = aVar.f291240h) == null) {
                arrayList = new java.util.ArrayList();
            }
            storyMsgListView.c(arrayList);
            return;
        }
        java.lang.String str = "";
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView2 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList4.get(1);
            if4.a aVar2 = storyMsgView.f172019q;
            if (aVar2 == null || (arrayList3 = aVar2.f291240h) == null) {
                arrayList3 = new java.util.ArrayList();
            }
            storyMsgListView2.c(arrayList3);
            mf4.d dVar = mf4.d.f326160a;
            long j17 = storyMsgView.f172025w;
            if (j17 != 0) {
                java.lang.String bigInteger = new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString();
                kotlin.jvm.internal.o.f(bigInteger, "toString(...)");
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bigInteger);
                while (stringBuffer.length() < 25) {
                    stringBuffer.insert(0, "0");
                }
                str = stringBuffer.toString();
                kotlin.jvm.internal.o.f(str, "toString(...)");
            }
            if (mf4.d.f326168i) {
                com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct storyPageExposeStruct = mf4.d.f326161b;
                storyPageExposeStruct.f60916d = 5L;
                storyPageExposeStruct.f60917e = storyPageExposeStruct.b("StoryId", str, true);
                dVar.b();
            }
            mf4.d.f326168i = false;
            return;
        }
        com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView3 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList4.get(0);
        if4.a aVar3 = storyMsgView.f172019q;
        if (aVar3 == null || (arrayList2 = aVar3.f291242j) == null) {
            arrayList2 = new java.util.ArrayList();
        }
        storyMsgListView3.c(arrayList2);
        storyMsgView.getCommentInputView().b();
        storyMsgView.getCommentInputView().setVisibility(8);
        mf4.d dVar2 = mf4.d.f326160a;
        long j18 = storyMsgView.f172025w;
        if (j18 != 0) {
            java.lang.String bigInteger2 = new java.math.BigInteger(java.lang.Long.toBinaryString(j18), 2).toString();
            kotlin.jvm.internal.o.f(bigInteger2, "toString(...)");
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(bigInteger2);
            while (stringBuffer2.length() < 25) {
                stringBuffer2.insert(0, "0");
            }
            str = stringBuffer2.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        }
        if (mf4.d.f326167h) {
            com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct storyPageExposeStruct2 = mf4.d.f326161b;
            storyPageExposeStruct2.f60916d = 8L;
            storyPageExposeStruct2.f60917e = storyPageExposeStruct2.b("StoryId", str, true);
            dVar2.b();
        }
        mf4.d.f326167h = false;
    }
}
