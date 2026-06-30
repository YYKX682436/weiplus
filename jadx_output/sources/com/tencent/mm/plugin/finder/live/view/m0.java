package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class m0 extends in5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116468a;

    public m0(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView) {
        this.f116468a = finderLiveAfterPluginRecommendLiveView;
    }

    @Override // in5.i
    public java.lang.Object a(androidx.recyclerview.widget.k3 k3Var) {
        r45.fa2 fa2Var;
        java.util.LinkedList linkedList;
        if (k3Var == null || (fa2Var = this.f116468a.f115796v.f116622d) == null || (linkedList = fa2Var.f374129h) == null) {
            return null;
        }
        return (r45.ea2) kz5.n0.a0(linkedList, k3Var.getAdapterPosition());
    }

    @Override // in5.i
    public long b(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.fa2 fa2Var;
        java.util.LinkedList linkedList;
        r45.ea2 ea2Var = null;
        if (k3Var != null && (fa2Var = this.f116468a.f115796v.f116622d) != null && (linkedList = fa2Var.f374129h) != null) {
            ea2Var = (r45.ea2) kz5.n0.a0(linkedList, k3Var.getAdapterPosition());
        }
        if (ea2Var == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2)) == null) {
            return 0L;
        }
        return finderObject.getId();
    }

    @Override // in5.i
    public void c(java.util.Set recordsSet) {
        java.lang.String str;
        int intValue;
        java.lang.Object tag;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "onExposeTimeRecorded: size = " + recordsSet.size());
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f116468a;
        finderLiveAfterPluginRecommendLiveView.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.e eVar = (in5.e) it.next();
            r45.ni4 ni4Var = new r45.ni4();
            r45.ea2 ea2Var = (r45.ea2) eVar.f293022a;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            ni4Var.set(0, java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : 0L));
            ni4Var.set(5, java.lang.Integer.valueOf((int) eVar.f293025d));
            ni4Var.set(6, java.lang.Integer.valueOf(eVar.f293026e));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            if (finderObject2 == null || (str = finderObject2.getSessionBuffer()) == null) {
                str = "";
            }
            ni4Var.set(4, str);
            if (finderLiveAfterPluginRecommendLiveView.f115795u != null) {
                android.view.View view = eVar.f293027f;
                if (view == null || (tag = view.getTag(com.tencent.mm.R.id.f486100k62)) == null) {
                    java.lang.Integer num = 0;
                    intValue = num.intValue();
                } else {
                    long longValue = tag instanceof java.lang.Long ? ((java.lang.Number) tag).longValue() : 0L;
                    intValue = java.lang.Integer.valueOf(longValue != 0 ? (int) (android.os.SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                }
                ni4Var.set(7, java.lang.Integer.valueOf(intValue));
                android.view.View view2 = eVar.f293027f;
                if (view2 != null) {
                    view2.setTag(com.tencent.mm.R.id.f486100k62, 0L);
                }
            }
            ni4Var.set(8, java.lang.Boolean.FALSE);
            linkedList.add(ni4Var);
            ni4Var.set(9, java.lang.Long.valueOf(eVar.f293023b));
            ni4Var.set(13, java.lang.Long.valueOf(eVar.f293023b));
            ni4Var.set(12, java.lang.Integer.valueOf(ni4Var.getInteger(5)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded pos:");
            sb6.append(eVar.f293026e);
            sb6.append(" start_effective_expose_time_ms: ");
            sb6.append(eVar.f293023b);
            sb6.append(" feedId: ");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            sb6.append(pm0.v.u(finderObject3 != null ? finderObject3.getId() : 0L));
            sb6.append(" auto_play_time_ms:");
            sb6.append(ni4Var.getInteger(7));
            sb6.append("expose_time_ms:");
            sb6.append(eVar.f293025d);
            sb6.append(" nick:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            sb6.append(finderObject4 != null ? finderObject4.getNickname() : null);
            sb6.append(" effective_expose_time_ms:");
            sb6.append(ni4Var.getInteger(12));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", sb6.toString());
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        so2.h3.f410392d.d(linkedList);
    }

    @Override // in5.i
    public void d(in5.e item) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(item, "item");
        this.f116468a.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Object obj = item.f293022a;
        r45.ea2 ea2Var = obj instanceof r45.ea2 ? (r45.ea2) obj : null;
        if (ea2Var != null) {
            r45.ni4 ni4Var = new r45.ni4();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            ni4Var.set(0, java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : 0L));
            ni4Var.set(9, java.lang.Long.valueOf(item.f293023b));
            ni4Var.set(6, java.lang.Integer.valueOf(item.f293026e));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            if (finderObject2 == null || (str = finderObject2.getSessionBuffer()) == null) {
                str = "";
            }
            ni4Var.set(4, str);
            ni4Var.set(11, 2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleOnItemExposeStart pos:");
            sb6.append(item.f293026e);
            sb6.append(" feedId: ");
            sb6.append(pm0.v.u(ni4Var.getLong(0)));
            sb6.append(" start_expose_time_ms:");
            sb6.append(ni4Var.getLong(9));
            sb6.append(" nick:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            sb6.append(finderObject3 != null ? finderObject3.getNickname() : null);
            sb6.append(" sessionBuffer:");
            sb6.append(ni4Var.getString(4));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", sb6.toString());
            linkedList.add(ni4Var);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        so2.h3.f410392d.d(linkedList);
    }
}
