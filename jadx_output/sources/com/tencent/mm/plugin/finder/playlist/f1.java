package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.playlist.f1 f122302d = new com.tencent.mm.plugin.finder.playlist.f1();

    public f1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.vx0 vx0Var;
        r45.vx0 vx0Var2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.dm2 object_extend = finderObject.getObject_extend();
        java.lang.Integer num = null;
        sb6.append((object_extend == null || (vx0Var2 = (r45.vx0) object_extend.getCustom(0)) == null) ? null : vx0Var2.getString(1));
        sb6.append('_');
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        if (object_extend2 != null && (vx0Var = (r45.vx0) object_extend2.getCustom(0)) != null) {
            num = java.lang.Integer.valueOf(vx0Var.getInteger(6));
        }
        sb6.append(num);
        return sb6.toString();
    }
}
