package tv2;

/* loaded from: classes10.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final dn.m a(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, dn.k taskCallback, java.lang.String name, java.lang.String mediaId, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, yz5.l lVar) {
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        kotlin.jvm.internal.o.g(taskCallback, "taskCallback");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        dn.m mVar = new dn.m();
        mVar.f241785d = name;
        mVar.f241787f = taskCallback;
        mVar.field_mediaId = mediaId;
        mVar.field_fullpath = str;
        mVar.field_thumbpath = str2;
        mVar.field_talker = "";
        boolean z17 = true;
        mVar.field_needStorage = true;
        mVar.field_priority = 2;
        mVar.field_bzScene = 2;
        mVar.field_appType = 251;
        mVar.field_fileType = i17;
        mVar.A = i18;
        mVar.B = i19;
        mVar.N = uv2.i.f431389a.g(finderItem.getFeedObject());
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            mVar.N += str3;
        }
        if (lVar != null) {
            lVar.invoke(mVar);
        }
        return mVar;
    }
}
