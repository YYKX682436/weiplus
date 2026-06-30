package fb2;

/* loaded from: classes2.dex */
public final class a implements fb2.m {

    /* renamed from: a, reason: collision with root package name */
    public long f260839a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f260840b = "";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127960u2).getValue()).r()).intValue() == 1) {
            this.f260839a = resp.d().getLong(12);
            java.lang.String string = resp.d().getString(19);
            if (string == null) {
                string = "";
            }
            this.f260840b = string;
            if (this.f260839a != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                java.util.LinkedList list = resp.getList(1);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = null;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (((com.tencent.mm.protocal.protobuf.FinderObject) next).getId() == this.f260839a) {
                            finderObject = next;
                            break;
                        }
                    }
                    finderObject = finderObject;
                }
                if (finderObject != null) {
                    java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = finderObject.getLikeList();
                    kotlin.jvm.internal.o.f(likeList, "getLikeList(...)");
                    java.util.Iterator<com.tencent.mm.protocal.protobuf.FinderCommentInfo> it6 = likeList.iterator();
                    int i27 = 0;
                    while (true) {
                        i19 = -1;
                        if (!it6.hasNext()) {
                            i27 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.o.b(it6.next().getUsername(), c01.z1.r())) {
                            break;
                        }
                        i27++;
                    }
                    if (i27 > 1) {
                        finderObject.getLikeList().add(1, finderObject.getLikeList().remove(i27));
                    }
                    java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList2 = finderObject.getLikeList();
                    kotlin.jvm.internal.o.f(likeList2, "getLikeList(...)");
                    java.util.Iterator<com.tencent.mm.protocal.protobuf.FinderCommentInfo> it7 = likeList2.iterator();
                    int i28 = 0;
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.o.b(it7.next().getUsername(), this.f260840b)) {
                            i19 = i28;
                            break;
                        }
                        i28++;
                    }
                    if (i19 > 0) {
                        finderObject.getLikeList().add(0, finderObject.getLikeList().remove(i19));
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("meExistIndex=");
                    sb6.append(i27);
                    sb6.append(" friendExistIndex=");
                    sb6.append(i19);
                    sb6.append(" redDotUsername=");
                    sb6.append(this.f260840b);
                    sb6.append(" self=");
                    sb6.append(c01.z1.r());
                    sb6.append("likeList=");
                    java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList3 = finderObject.getLikeList();
                    kotlin.jvm.internal.o.f(likeList3, "getLikeList(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(likeList3, 10));
                    java.util.Iterator<T> it8 = likeList3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) it8.next()).getUsername());
                    }
                    sb6.append(arrayList);
                    com.tencent.mars.xlog.Log.i("Finder.AdjustOrderAvatarInterceptor", sb6.toString());
                }
            }
        }
        return false;
    }

    @Override // fb2.m
    public boolean b(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    @Override // fb2.m
    public boolean c(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }
}
