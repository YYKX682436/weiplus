package m31;

/* loaded from: classes9.dex */
public final class b implements java.util.Comparator {
    public b(m31.f fVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj2;
        if (subscribeMsgTmpItem != null && subscribeMsgTmpItem2 != null) {
            int i17 = subscribeMsgTmpItem2.f71820z;
            int i18 = subscribeMsgTmpItem.f71820z;
            if (i18 == 1 && i17 != 1) {
                return 1;
            }
            if (i18 != 1 && i17 == 1) {
                return -1;
            }
        }
        return 0;
    }
}
