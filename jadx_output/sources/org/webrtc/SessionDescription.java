package org.webrtc;

/* loaded from: classes6.dex */
public class SessionDescription {
    public final java.lang.String description;
    public final org.webrtc.SessionDescription.Type type;

    /* loaded from: classes6.dex */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK;

        public java.lang.String canonicalForm() {
            return name().toLowerCase(java.util.Locale.US);
        }
    }

    public SessionDescription(org.webrtc.SessionDescription.Type type, java.lang.String str) {
        this.type = type;
        this.description = str;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }
}
