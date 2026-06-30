package nz0;

/* loaded from: classes5.dex */
public final class j implements com.tencent.maas.MJMaasCore.TemplateServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final nz0.j f341516a = new nz0.j();

    @Override // com.tencent.maas.MJMaasCore.TemplateServiceProvider
    public final com.tencent.maas.model.MJTemplateMetadata onRequestTemplateMetadata(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        return (com.tencent.maas.model.MJTemplateMetadata) kotlinx.coroutines.l.f(null, new nz0.i(templateId, null), 1, null);
    }
}
