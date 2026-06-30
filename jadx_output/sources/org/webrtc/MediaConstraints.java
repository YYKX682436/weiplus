package org.webrtc;

/* loaded from: classes.dex */
public class MediaConstraints {
    public final java.util.List<org.webrtc.MediaConstraints.KeyValuePair> mandatory = new java.util.ArrayList();
    public final java.util.List<org.webrtc.MediaConstraints.KeyValuePair> optional = new java.util.ArrayList();

    /* loaded from: classes.dex */
    public static class KeyValuePair {
        private final java.lang.String key;
        private final java.lang.String value;

        public KeyValuePair(java.lang.String str, java.lang.String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            org.webrtc.MediaConstraints.KeyValuePair keyValuePair = (org.webrtc.MediaConstraints.KeyValuePair) obj;
            return this.key.equals(keyValuePair.key) && this.value.equals(keyValuePair.value);
        }

        public java.lang.String getKey() {
            return this.key;
        }

        public java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.key.hashCode() + this.value.hashCode();
        }

        public java.lang.String toString() {
            return this.key + ": " + this.value;
        }
    }

    private static java.lang.String stringifyKeyValuePairList(java.util.List<org.webrtc.MediaConstraints.KeyValuePair> list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (org.webrtc.MediaConstraints.KeyValuePair keyValuePair : list) {
            if (sb6.length() > 1) {
                sb6.append(", ");
            }
            sb6.append(keyValuePair.toString());
        }
        sb6.append("]");
        return sb6.toString();
    }

    public java.util.List<org.webrtc.MediaConstraints.KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    public java.util.List<org.webrtc.MediaConstraints.KeyValuePair> getOptional() {
        return this.optional;
    }

    public java.lang.String toString() {
        return "mandatory: " + stringifyKeyValuePairList(this.mandatory) + ", optional: " + stringifyKeyValuePairList(this.optional);
    }
}
