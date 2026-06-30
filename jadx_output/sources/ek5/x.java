package ek5;

/* loaded from: classes9.dex */
public final class x extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        ld5.b bVar = new ld5.b();
        param.a(bVar);
        java.io.Serializable serializableExtra = intent.getSerializableExtra("Retr_Msg_Id_List");
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        bVar.o(list != null ? new java.util.LinkedList(list) : null);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("Retr_File_Path_List");
        bVar.p(stringArrayListExtra != null ? new java.util.LinkedList(stringArrayListExtra) : null);
        return bVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.a0.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return r50.l0.class;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return ld5.b.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(12);
    }

    @Override // ek5.b
    public void k(android.content.Intent retransmitIntent) {
        kotlin.jvm.internal.o.g(retransmitIntent, "retransmitIntent");
        int intExtra = retransmitIntent.getIntExtra("Retr_Msg_Type", -1);
        int intExtra2 = retransmitIntent.getIntExtra("Retr_Scene", 0);
        if (intExtra == 0 && intExtra2 == 1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = retransmitIntent.getStringArrayListExtra("Retr_File_Path_List");
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMultiConfig", "preProcessRetransmitIntent filePaths:" + stringArrayListExtra);
            if (stringArrayListExtra == null || stringArrayListExtra.size() <= 1) {
                return;
            }
            retransmitIntent.putExtra("Retr_Msg_Type", 12);
        }
    }
}
