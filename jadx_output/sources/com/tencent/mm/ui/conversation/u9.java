package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class u9 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.x9 f208105d;

    public u9(com.tencent.mm.ui.conversation.x9 x9Var) {
        this.f208105d = x9Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView;
        com.tencent.mm.storage.l4 l4Var;
        java.util.HashMap hashMap;
        java.util.Collection values;
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.ui.conversation.ConvExposeHelper convExposeHelper = com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d;
        com.tencent.mm.ui.conversation.x9 x9Var = this.f208105d;
        convExposeHelper.m(x9Var.f208239a, x9Var.f208240b, true, true, false);
        com.tencent.mm.ui.conversation.o5 o5Var = x9Var.f208241c;
        if (o5Var != null && (conversationListView = o5Var.f207926f) != null) {
            int childCount = conversationListView.getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount) {
                    break;
                }
                android.view.View childAt = conversationListView.getChildAt(i27);
                android.view.View findViewById = childAt != null ? childAt.findViewById(com.tencent.mm.R.id.f483944cj1) : null;
                if (findViewById != null && (findViewById.getTag() instanceof yf5.n)) {
                    java.lang.Object tag = findViewById.getTag();
                    kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
                    yf5.n nVar = (yf5.n) tag;
                    if (com.tencent.mm.storage.z3.X3(nVar.f461926m)) {
                        yf5.j0 j0Var = o5Var.f207924d;
                        if (j0Var == null || (hashMap = ((yf5.w0) j0Var).f461985q.f461846c) == null || (values = hashMap.values()) == null) {
                            l4Var = null;
                        } else {
                            java.util.Iterator it = values.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it.next();
                                    if (((com.tencent.mm.storage.l4) obj).f195085g2 == 66) {
                                        break;
                                    }
                                }
                            }
                            l4Var = (com.tencent.mm.storage.l4) obj;
                        }
                        if (!(l4Var != null)) {
                            if (childAt.getBottom() <= o5Var.f207936s) {
                                com.tencent.mm.ui.conversation.o5.h(o5Var, 8, false, 2, null);
                            } else {
                                o5Var.f(0, false);
                            }
                        }
                    }
                    if (nVar.f461927n) {
                        if (nVar.f461934u != 0 && childAt.getBottom() >= o5Var.f207936s) {
                            o5Var.f(0, false);
                            break;
                        }
                        com.tencent.mm.ui.conversation.o5.h(o5Var, 8, false, 2, null);
                    } else if (childAt.getTop() <= o5Var.f207936s) {
                        com.tencent.mm.ui.conversation.o5.h(o5Var, 8, false, 2, null);
                        break;
                    }
                }
                i27++;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.tencent.mm.ui.conversation.x9 x9Var = this.f208105d;
        if (i17 != 0) {
            x9Var.b();
        } else {
            if (x9Var.f208239a == null) {
                yj0.a.h(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            com.tencent.mm.ui.conversation.x9.a(x9Var, -1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
