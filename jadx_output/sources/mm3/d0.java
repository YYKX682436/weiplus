package mm3;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI f329616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f329617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(0);
        this.f329616d = musicMvFreeMakerPreviewUI;
        this.f329617e = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        java.util.LinkedList list;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.ef2 mvInfo2;
        com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI = this.f329616d;
        r45.ss4 ss4Var = musicMvFreeMakerPreviewUI.f150894e;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
        java.util.LinkedList<r45.jf2> list2 = (finderObject == null || (objectDesc2 = finderObject.getObjectDesc()) == null || (mvInfo2 = objectDesc2.getMvInfo()) == null) ? null : mvInfo2.getList(5);
        if (list2 == null || list2.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicMvFreeMakerPreviewUI", "null or empty track list: " + list2);
            musicMvFreeMakerPreviewUI.finish();
        } else {
            for (r45.jf2 jf2Var : list2) {
                java.util.LinkedList list3 = ss4Var.getList(1);
                kotlin.jvm.internal.o.f(list3, "getRefObjectList(...)");
                java.util.Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                    if (jf2Var.getLong(2) != 0 ? jf2Var.getLong(2) == finderObject2.getId() : kotlin.jvm.internal.o.b(jf2Var.getString(3), finderObject2.getObjectNonceId())) {
                        break;
                    }
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                r45.jf2 jf2Var2 = (finderObject3 == null || (objectDesc = finderObject3.getObjectDesc()) == null || (mvInfo = objectDesc.getMvInfo()) == null || (list = mvInfo.getList(5)) == null) ? null : (r45.jf2) kz5.n0.Z(list);
                if (jf2Var2 != null) {
                    jf2Var2.set(0, java.lang.Long.valueOf(jf2Var.getLong(0)));
                    jf2Var2.set(1, java.lang.Integer.valueOf(jf2Var.getInteger(1)));
                    jf2Var2.set(4, java.lang.Long.valueOf(jf2Var.getLong(4)));
                    jf2Var2.set(10, jf2Var.getString(10));
                }
            }
            java.util.Iterator it6 = list2.iterator();
            kotlin.jvm.internal.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                if (((r45.jf2) it6.next()).getInteger(1) <= 0) {
                    it6.remove();
                }
            }
        }
        mm3.c0 c0Var = new mm3.c0(this.f329617e, musicMvFreeMakerPreviewUI);
        r45.ss4 ss4Var2 = musicMvFreeMakerPreviewUI.f150894e;
        java.lang.String string = ss4Var2.getString(2);
        if (string == null || string.length() == 0) {
            fm3.u.A.c(ss4Var2, c0Var);
        } else {
            c0Var.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
