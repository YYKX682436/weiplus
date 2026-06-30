package com.tencent.mm.ui.transmit.recent;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f211056a;

    public i() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f211056a = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            arrayList2.clear();
            arrayList.clear();
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.addAll(com.tencent.mm.ui.contact.i5.b());
            java.util.HashSet i17 = c01.e2.i();
            i17.remove("filehelper");
            hashSet.addAll(i17);
            arrayList.addAll(hashSet);
            arrayList.addAll(k35.c.a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bd, code lost:
    
        if (r10 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c4, code lost:
    
        r6.f206818y = r10;
        com.tencent.mars.xlog.Log.i("MircoMsg.RecentForwardDataProvider", "createConversationDataItem " + r3 + " item: " + r6 + " nickname:" + ((java.lang.Object) r6.f206818y) + " username:" + r6.f206819z);
        r2.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        if (r1.moveToNext() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c2, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c0, code lost:
    
        if (r10 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.recent.i.a():java.util.ArrayList");
    }

    public final java.util.ArrayList b() {
        java.util.ArrayList arrayList;
        android.os.Bundle bundle = (android.os.Bundle) uk0.a.d(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.ui.transmit.recent.h.f211055a);
        if (bundle != null) {
            bundle.setClassLoader(com.tencent.mm.ui.transmit.recent.ForwardConversationInfo.class.getClassLoader());
            arrayList = bundle.getParcelableArrayList("list");
        } else {
            arrayList = null;
        }
        return arrayList == null ? new java.util.ArrayList() : arrayList;
    }
}
