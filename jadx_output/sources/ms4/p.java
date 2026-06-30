package ms4;

/* loaded from: classes8.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        kotlin.jvm.internal.o.g(finderJumpInfo, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appid:");
        r45.k74 lite_app_info = finderJumpInfo.getLite_app_info();
        sb6.append(lite_app_info != null ? lite_app_info.getString(0) : null);
        sb6.append(", query:");
        r45.k74 lite_app_info2 = finderJumpInfo.getLite_app_info();
        sb6.append(lite_app_info2 != null ? lite_app_info2.getString(2) : null);
        sb6.append(", path:");
        r45.k74 lite_app_info3 = finderJumpInfo.getLite_app_info();
        sb6.append(lite_app_info3 != null ? lite_app_info3.getString(1) : null);
        sb6.append(", default_url:");
        r45.k74 lite_app_info4 = finderJumpInfo.getLite_app_info();
        sb6.append(lite_app_info4 != null ? lite_app_info4.getString(3) : null);
        sb6.append(", ");
        return sb6.toString();
    }
}
