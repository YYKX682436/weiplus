package hc2;

/* loaded from: classes2.dex */
public abstract class j0 {
    public static final void a(java.util.List list, java.lang.String tag) {
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        list.size();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) it.next();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(finderItem.getCreateTime());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
            sb6.append(i17);
            sb6.append(" print item id:");
            sb6.append(finderItem.getId());
            sb6.append(" rowid:");
            sb6.append(finderItem.getLocalId());
            sb6.append(" time: ");
            sb6.append(valueOf);
            sb6.append(" sourceFlag:");
            sb6.append(finderItem.field_sourceFlag);
            sb6.append(" username:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderItem.getFinderObject();
            sb6.append(finderObject != null ? finderObject.getUsername() : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLogEx", sb6.toString());
            i17++;
        }
    }
}
