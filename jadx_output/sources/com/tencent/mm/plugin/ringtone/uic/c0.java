package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class c0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158370d;

    public c0(com.tencent.mm.plugin.ringtone.uic.v0 v0Var) {
        this.f158370d = v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.view.View view;
        java.util.List data;
        java.util.List<ox3.a> data2;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        java.util.List data3;
        java.util.List data4;
        java.util.List data5;
        java.util.List data6;
        px3.b bVar = (px3.b) obj;
        if (bVar instanceof px3.a) {
            px3.a aVar = (px3.a) bVar;
            int i17 = aVar.f358935b;
            com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158370d;
            if (i17 != 1) {
                java.util.List<ox3.a> list = aVar.f358934a;
                if (i17 != 4) {
                    if (i17 != 5) {
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = v0Var.f158518m;
                        int size = (wxRecyclerAdapter2 == null || (data6 = wxRecyclerAdapter2.getData()) == null) ? 0 : data6.size();
                        if (list != null) {
                            for (ox3.a aVar2 : list) {
                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = v0Var.f158518m;
                                ox3.a aVar3 = null;
                                if (wxRecyclerAdapter3 != null && (data5 = wxRecyclerAdapter3.getData()) != null) {
                                    java.util.Iterator it = data5.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        java.lang.Object next = it.next();
                                        if (((ox3.a) next).getItemId() == aVar2.getItemId()) {
                                            aVar3 = next;
                                            break;
                                        }
                                    }
                                    aVar3 = aVar3;
                                }
                                if (aVar3 == null) {
                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = v0Var.f158518m;
                                    if (wxRecyclerAdapter4 != null && (data4 = wxRecyclerAdapter4.getData()) != null) {
                                        data4.add(aVar2);
                                    }
                                } else {
                                    aVar3.f349722e = false;
                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter5 = v0Var.f158518m;
                                    if (wxRecyclerAdapter5 != null) {
                                        wxRecyclerAdapter5.d0(aVar3.getItemId(), java.lang.Boolean.FALSE);
                                    }
                                }
                            }
                        }
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter6 = v0Var.f158518m;
                        if (((wxRecyclerAdapter6 == null || (data3 = wxRecyclerAdapter6.getData()) == null || !(data3.isEmpty() ^ true)) ? false : true) && (wxRecyclerAdapter = v0Var.f158518m) != null) {
                            wxRecyclerAdapter.notifyItemRangeChanged(size, list != null ? list.size() : 0);
                        }
                    } else if (list != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.addAll(list);
                        v0Var.P6(arrayList);
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            ox3.a aVar4 = (ox3.a) it6.next();
                            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "current member  data must be init from cache " + aVar4.f349721d.f415588d + " and " + aVar4.f349721d);
                        }
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter7 = v0Var.f158518m;
                        if (wxRecyclerAdapter7 != null) {
                            wxRecyclerAdapter7.notifyDataSetChanged();
                        }
                    }
                } else if (list != null) {
                    for (ox3.a aVar5 : list) {
                        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "current member  data must be delete " + aVar5.f349721d.f415588d + " and " + aVar5.f349721d);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter8 = v0Var.f158518m;
                        if (wxRecyclerAdapter8 != null && (data2 = wxRecyclerAdapter8.getData()) != null) {
                            for (ox3.a aVar6 : data2) {
                                if (aVar6.getItemId() != aVar5.getItemId()) {
                                    arrayList2.add(aVar6);
                                } else if (aVar6.f349722e) {
                                    androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
                                    kotlin.jvm.internal.o.g(activity, "activity");
                                    ((com.tencent.mm.plugin.ringtone.uic.z1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).O6();
                                }
                            }
                        }
                        v0Var.P6(arrayList2);
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter9 = v0Var.f158518m;
                        if (wxRecyclerAdapter9 != null) {
                            wxRecyclerAdapter9.e0(aVar5.getItemId());
                        }
                    }
                }
            } else {
                v0Var.P6(new java.util.ArrayList());
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter10 = v0Var.f158518m;
            boolean z17 = (wxRecyclerAdapter10 == null || (data = wxRecyclerAdapter10.getData()) == null || !data.isEmpty()) ? false : true;
            jz5.g gVar = v0Var.f158517i;
            jz5.g gVar2 = v0Var.f158514f;
            jz5.g gVar3 = v0Var.f158515g;
            if (z17) {
                view = (android.view.View) ((jz5.n) gVar2).getValue();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = (android.view.View) ((jz5.n) gVar3).getValue();
                if (view2 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = (android.view.View) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                view = (android.view.View) ((jz5.n) gVar3).getValue();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view, arrayList6.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = (android.view.View) ((jz5.n) gVar2).getValue();
                if (view4 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view5 = (android.view.View) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC", "refreshAddUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            view.setOnClickListener(new com.tencent.mm.plugin.ringtone.uic.s0(v0Var));
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getHitRect(rect);
            rect.right += 100;
            rect.bottom += 100;
            java.lang.Object parent = view.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
        }
        return jz5.f0.f302826a;
    }
}
