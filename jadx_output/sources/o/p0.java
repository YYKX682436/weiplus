package o;

/* loaded from: classes16.dex */
public final class p0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate {

    /* renamed from: d, reason: collision with root package name */
    public o.q0 f341779d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate.Companion companion = com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate
    public void onChangeVisibilityCallback(byte[] bArr, boolean z17) {
        o.q0 q0Var;
        if (bArr == null || (q0Var = this.f341779d) == null) {
            return;
        }
        kotlin.jvm.internal.o.d(q0Var);
        bw5.nk0 parseFrom = new bw5.nk0().parseFrom(bArr);
        kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineFooterBarUIC", "onChangeVisibilityCallback: isConfirm=" + z17 + ", includeFriendNum=" + parseFrom.f30715h + ", includeLabelNum=" + parseFrom.f30713f + ", excludeFriendNum=" + parseFrom.f30721q);
        com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC combineFooterBarUIC = ((u.d) q0Var).f423391a;
        int i17 = combineFooterBarUIC.J6;
        java.util.List list = kz5.p0.f313996d;
        if (i17 == 1) {
            java.util.List list2 = parseFrom.f30714g;
            if (list2 == null) {
                list2 = list;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((bw5.ok0) it.next()).b());
            }
            combineFooterBarUIC.H6 = new java.util.ArrayList(arrayList);
            java.util.List list3 = parseFrom.f30712e;
            if (list3 == null) {
                list3 = list;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(((bw5.pk0) it6.next()).f31708d));
            }
            combineFooterBarUIC.G6 = new java.util.ArrayList(arrayList2);
            java.util.List list4 = parseFrom.f30720p;
            if (list4 != null) {
                list = list4;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList3.add(((bw5.ok0) it7.next()).b());
            }
            combineFooterBarUIC.I6 = new java.util.ArrayList(arrayList3);
        } else {
            java.util.List list5 = parseFrom.f30720p;
            if (list5 == null) {
                list5 = list;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list5, 10));
            java.util.Iterator it8 = list5.iterator();
            while (it8.hasNext()) {
                arrayList4.add(((bw5.ok0) it8.next()).b());
            }
            combineFooterBarUIC.H6 = new java.util.ArrayList(arrayList4);
            java.util.List list6 = parseFrom.f30718n;
            if (list6 == null) {
                list6 = list;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list6, 10));
            java.util.Iterator it9 = list6.iterator();
            while (it9.hasNext()) {
                arrayList5.add(java.lang.String.valueOf(((bw5.pk0) it9.next()).f31708d));
            }
            combineFooterBarUIC.G6 = new java.util.ArrayList(arrayList5);
            java.util.List list7 = parseFrom.f30714g;
            if (list7 != null) {
                list = list7;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                arrayList6.add(((bw5.ok0) it10.next()).b());
            }
            combineFooterBarUIC.I6 = new java.util.ArrayList(arrayList6);
        }
        if (z17) {
            com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC.a(combineFooterBarUIC);
            return;
        }
        combineFooterBarUIC.c();
        com.tencent.mm.autogen.events.SelectContactListAndExcludeToInsideEvent selectContactListAndExcludeToInsideEvent = new com.tencent.mm.autogen.events.SelectContactListAndExcludeToInsideEvent();
        java.util.ArrayList arrayList7 = combineFooterBarUIC.H6;
        h.i iVar = selectContactListAndExcludeToInsideEvent.f54745m;
        iVar.f277768a = arrayList7;
        iVar.f277769b = combineFooterBarUIC.I6;
        selectContactListAndExcludeToInsideEvent.e();
        com.tencent.mm.autogen.events.SelectLabelIdListToInsideEvent selectLabelIdListToInsideEvent = new com.tencent.mm.autogen.events.SelectLabelIdListToInsideEvent();
        selectLabelIdListToInsideEvent.f54747m.f277771a = combineFooterBarUIC.G6;
        selectLabelIdListToInsideEvent.e();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate.Companion companion = com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsVisibilityShowFromCombineDelegate.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f341779d = null;
    }
}
