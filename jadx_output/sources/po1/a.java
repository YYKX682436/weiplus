package po1;

/* loaded from: classes5.dex */
public final class a implements android.os.Parcelable.Creator {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo a(com.tencent.wechat.aff.affroam.i affRange) {
        jz5.l lVar;
        kotlin.jvm.internal.o.g(affRange, "affRange");
        com.tencent.wechat.aff.affroam.m mVar = (com.tencent.wechat.aff.affroam.m) affRange.f215841d.get(0);
        if (mVar.f215900f.size() > 0) {
            java.util.LinkedList linkedList = mVar.f215900f;
            lVar = new jz5.l(java.lang.Long.valueOf(((com.tencent.wechat.aff.affroam.l) linkedList.get(0)).f215884d), java.lang.Long.valueOf(((com.tencent.wechat.aff.affroam.l) linkedList.get(0)).f215885e));
        } else {
            lVar = new jz5.l(0L, 0L);
        }
        long longValue = ((java.lang.Number) lVar.f302833d).longValue();
        long longValue2 = ((java.lang.Number) lVar.f302834e).longValue();
        if (mVar.f215898d.f215877e.contains(com.tencent.wechat.aff.affroam.j.kAll)) {
            com.tencent.wechat.aff.affroam.k kVar = mVar.f215899e;
            return (kVar == null || !kVar.f215877e.contains(com.tencent.wechat.aff.affroam.j.kFoldChatRoom)) ? new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(po1.b.f357289d, null, null, longValue, longValue2, 6, null) : new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(po1.b.f357291f, null, null, longValue, longValue2, 6, null);
        }
        po1.b bVar = po1.b.f357290e;
        java.util.LinkedList linkedList2 = mVar.f215898d.f215878f;
        kotlin.jvm.internal.o.f(linkedList2, "getInSpecialLabel(...)");
        java.util.List V0 = kz5.n0.V0(linkedList2);
        java.util.LinkedList linkedList3 = mVar.f215898d.f215876d;
        kotlin.jvm.internal.o.f(linkedList3, "getIsExactUsername(...)");
        return new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(bVar, V0, kz5.n0.V0(linkedList3), longValue, longValue2);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0 || readInt >= ((kz5.b) po1.b.f357293h).d()) {
            po1.b bVar = po1.b.f357289d;
            readInt = 0;
        }
        po1.b bVar2 = (po1.b) ((rz5.c) po1.b.f357293h).get(readInt);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            for (java.lang.String str : r26.n0.e0(readString, new char[]{','}, false, 0, 6, null)) {
                java.lang.Integer valueOf = str.length() > 0 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)) : null;
                if (valueOf != null) {
                    arrayList.add(valueOf);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        parcel.readStringList(arrayList2);
        return new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(bVar2, arrayList, arrayList2, parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo[i17];
    }
}
