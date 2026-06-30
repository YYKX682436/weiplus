package ii4;

/* loaded from: classes8.dex */
public abstract class a {
    public static final void a(com.tencent.mm.modelbase.r1 r1Var, com.tencent.mm.modelbase.m1 scene, androidx.lifecycle.y yVar, com.tencent.mm.modelbase.u0 u0Var) {
        kotlin.jvm.internal.o.g(r1Var, "<this>");
        kotlin.jvm.internal.o.g(scene, "scene");
        if (yVar != null && u0Var != null) {
            int type = scene.getType();
            if (type == -1) {
                throw new java.lang.IllegalArgumentException("BROADCAST TYPE Not support, use add addSceneEndListener");
            }
            r1Var.f70774q.a(type, yVar, e75.g.MainThread, new q01.j(u0Var));
        } else if (u0Var != null) {
            r1Var.a(scene.getType(), u0Var);
        }
        r1Var.g(scene);
    }
}
