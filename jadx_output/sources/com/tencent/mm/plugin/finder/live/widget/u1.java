package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u1 {
    public u1(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(r45.f50 f50Var, java.lang.String myFinderUsername) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(myFinderUsername, "myFinderUsername");
        if (f50Var == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = f50Var.f374017h;
        if (finderContact != null) {
            java.lang.String username = finderContact.getUsername();
            java.lang.String str2 = username == null ? "" : username;
            java.lang.String nickname = finderContact.getNickname();
            arrayList.add(new com.tencent.mm.plugin.finder.live.widget.v1(str2, nickname == null ? "" : nickname, finderContact.getHeadUrl(), 0, false));
        }
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> linkedList = f50Var.f374016g;
        if (linkedList != null) {
            for (com.tencent.mm.protocal.protobuf.FinderContact finderContact2 : linkedList) {
                if (!kotlin.jvm.internal.o.b(finderContact2.getUsername(), str)) {
                    java.lang.String username2 = finderContact2.getUsername();
                    java.lang.String str3 = username2 == null ? "" : username2;
                    java.lang.String nickname2 = finderContact2.getNickname();
                    arrayList.add(new com.tencent.mm.plugin.finder.live.widget.v1(str3, nickname2 == null ? "" : nickname2, finderContact2.getHeadUrl(), 1, true));
                }
            }
        }
        return arrayList;
    }
}
